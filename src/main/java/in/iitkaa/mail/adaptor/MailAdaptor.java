package in.iitkaa.mail.adaptor;

import in.iitkaa.mail.model.Alumnus;

import java.io.File;
import java.util.Set;

/**
 * @author Alok
 * @since 18-02-2015
 */
public interface MailAdaptor {

    /**
     * All the mail clients must implement this method
     * @param recipients     The intended people to receive the mail
     * @param subject        Subject of the mail
     * @param bodyText       Mail body
     * @param attachments    Files to attach in the mail
     */
    public void send(Set<Alumnus> recipients, String subject, String bodyText, File... attachments);

}
