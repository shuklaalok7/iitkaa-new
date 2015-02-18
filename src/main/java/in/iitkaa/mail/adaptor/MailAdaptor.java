package in.iitkaa.mail.adaptor;

import in.iitkaa.mail.model.Alumnus;

import java.util.Set;

/**
 * @author Alok
 * @since 18-02-2015
 */
public interface MailAdaptor {

    public void send(Set<Alumnus> recipients, String subject, String bodyText);

}
