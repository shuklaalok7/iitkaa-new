package in.iitkaa.mail.manager;

/**
 * @author Alok
 * @since 20-02-2015
 */
public interface MailService {
    /**
     * Send mail to the intended recipients
     * @param subject     Subject of the mail
     * @param bodyText    Message of the mail
     */
    public void sendMail(String subject, String bodyText);
}
