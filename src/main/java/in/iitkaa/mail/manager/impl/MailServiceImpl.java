package in.iitkaa.mail.manager.impl;

import in.iitkaa.mail.dto.AlumnusRequestDTO;
import in.iitkaa.mail.manager.MailService;
import in.iitkaa.mail.model.Alumnus;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Set;

/**
 * @author Alok
 * @since 18-02-2015
 */
@Service("MailService")
public class MailServiceImpl extends IitkaaManagerSupport implements MailService {

    @Override
    public void sendMail(String subject, String bodyText, File... attachments) {
        // Fetch alumnus from somewhere
        AlumnusRequestDTO alumnusRequestDTO = new AlumnusRequestDTO();
        Set<Alumnus> alumni = this.alumnusService.search(alumnusRequestDTO);
        this.mailAdaptor.send(alumni, subject, bodyText, attachments);
    }
}
