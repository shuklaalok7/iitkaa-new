package in.iitkaa.mail.init;

import in.iitkaa.mail.MailSender;

/**
 * @author Alok
 * @since 17-02-2015
 */
public class Application {
    public static void main(String... args) {
        MailSender mailSender = new MailSender();
        mailSender.sendMail("Meeting on last Wednesday", "It was nice meeting you last Wednesday evening.");
    }
}
