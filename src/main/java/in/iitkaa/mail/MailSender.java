package in.iitkaa.mail;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import in.iitkaa.mail.model.Alumnus;
import in.iitkaa.mail.util.AppConfig;

import java.util.Base64;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Alok
 * @since 17-02-2015
 */
public class MailSender {

    /**
     * Sends mail to all the alumni in the database
     * @param subject    Subject of the mail
     * @param body       Body of the mail
     */
    public void sendMail(String subject, String body) {
        Objects.requireNonNull(subject);
        Objects.requireNonNull(body);
        Base64.Decoder decoder = Base64.getDecoder();
        SendGrid sendGrid = new SendGrid(new String(decoder.decode(AppConfig.SEND_GRID_USERNAME)),
                new String(decoder.decode(AppConfig.SEND_GRID_PASSWORD)));
        SendGrid.Email email = new SendGrid.Email();
        Set<Alumnus> alumni = this.getAlumni();
        alumni.forEach(alumnus->email.addTo(alumnus.getEmail(), alumnus.getName()));

        email.setFrom(AppConfig.MailConfig.FROM_EMAIL);
        email.setFromName(AppConfig.MailConfig.FROM_NAME);
        email.setSubject(subject);
        email.setText(body);

        try {
            SendGrid.Response response = sendGrid.send(email);
            System.out.println(response.getMessage());
        } catch (SendGridException e) {
//            if (AppConfig.DEV_MODE) {
//                ScriptEngineManager javascriptEngineManager = new ScriptEngineManager();
//                ScriptEngine scriptEngine = javascriptEngineManager.getEngineByName(AppConfig.JAVASCRIPT_ENGINE);
//                try {
//                    scriptEngine.eval("print(e.errors)");
//                } catch (ScriptException e1) {
//                    e1.printStackTrace();
//                }
//            } else {
            e.printStackTrace();
//            }
        }
    }

    private Set<Alumnus> getAlumni() {
        return new HashSet<Alumnus>() {{
            add(new Alumnus("Alok Shukla", "alok@simsbuild.com"));
            add(new Alumnus("Prakhar Gupta", "prakhar@innosols.co.in"));
        }};

    }

}
