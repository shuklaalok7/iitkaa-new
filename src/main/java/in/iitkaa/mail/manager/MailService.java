package in.iitkaa.mail.manager;

import java.io.File;

/**
 * @author Alok
 * @since 20-02-2015
 */
public interface MailService {
    /**
     * Send mail to the intended recipients
     * @param subject     Subject of the mail
     * @param bodyText    Message of the mail
     * @param attachments Files to attach in the mail
     */
    public void sendMail(String subject, String bodyText, File... attachments);
}
