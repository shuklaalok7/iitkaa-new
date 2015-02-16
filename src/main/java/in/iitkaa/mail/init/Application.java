package in.iitkaa.mail.init;

import in.iitkaa.mail.MailSender;

/**
 * @author Alok
 * @since 17-02-2015
 */
public class Application {
    public static void main(String... args) {
        MailSender mailSender = new MailSender();
        mailSender.sendMail("Hello World", "My first email with SendGrid Java!");
    }
}
