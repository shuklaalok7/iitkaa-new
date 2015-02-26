package in.iitkaa.mail.action;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author Alok
 * @since 18-02-2015
 */
@Getter
@Setter
@Result(name = IitkaaActionSupport.SUCCESS, location = "mail.jsp")
public class MailAction extends IitkaaActionSupport {
    private String subject;
    private String bodyText;

    @Override
    @Action("/")
    public String execute() throws Exception {
        return super.execute();
    }

    @Action(value = "/send", results = {
            @Result(name = IitkaaActionSupport.SUCCESS, location = "mail.jsp")
    })
    public String sendMail() {
        this.getMailService().sendMail(this.getSubject(), this.getBodyText());
        return IitkaaActionSupport.SUCCESS;
    }

}
