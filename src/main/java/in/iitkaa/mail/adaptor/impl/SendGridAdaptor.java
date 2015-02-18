package in.iitkaa.mail.adaptor.impl;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import in.iitkaa.mail.adaptor.MailAdaptor;
import in.iitkaa.mail.model.Alumnus;
import in.iitkaa.mail.util.AppConfig;
import in.iitkaa.mail.util.AppUtils;
import in.iitkaa.mail.util.GlobalConstants;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Objects;
import java.util.Set;

import static java.lang.String.format;

/**
 * @author Alok
 * @since 18-02-2015
 */
@Component("SendGridAdaptor")
public class SendGridAdaptor implements MailAdaptor {
    private final String BODY_TEXT_TOKEN = "TEXT_CONTENT_GOES_HERE";

    @Override
    public void send(Set<Alumnus> recipients, String subject, String bodyText) {
        Objects.requireNonNull(subject);
        Objects.requireNonNull(bodyText);

        Base64.Decoder decoder = Base64.getDecoder();
        SendGrid sendGrid = new SendGrid(new String(decoder.decode(AppConfig.SEND_GRID_USERNAME)),
                new String(decoder.decode(AppConfig.SEND_GRID_PASSWORD)));
        SendGrid.Email email = new SendGrid.Email();
        recipients.forEach(recipient -> email.addBcc(recipient.getEmail()));

        email.setFrom(AppConfig.MailConfig.FROM_EMAIL);
        email.setFromName(AppConfig.MailConfig.FROM_NAME);
        email.setSubject(subject);
        this.setHtmlBody(bodyText, email);

        try {
            SendGrid.Response response;
            if (!AppConfig.DEV_MODE) {
                response = sendGrid.send(email);
            } else {
                response = new SendGrid.Response(200, "Dev mode ON.");
            }
            System.out.println(response.getMessage());
        } catch (SendGridException e) {
            e.printStackTrace();
        }
    }

    private void setHtmlBody(String bodyText, SendGrid.Email email) {
        String filePath = format("%s%s%s%s%d%s%s", AppConfig.RESOURCE_DIRECTORY, GlobalConstants.SLASH,
                AppConfig.TEMPLATE_FILE, GlobalConstants.UNDERSCORE, AppConfig.TEMPLATE_FILE_VERSION,
                GlobalConstants.DOT, GlobalConstants.HTML);
        try {
            String htmlBody = AppUtils.readFile(new File(filePath));
            htmlBody = htmlBody.replace(this.BODY_TEXT_TOKEN, bodyText);
            email.setHtml(htmlBody);

            // Adding AA logo
            email.addAttachment("logo.png", new File(AppConfig.RESOURCE_DIRECTORY+"/images/logo.png"));
            email.addContentId("logo.png", "logo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
