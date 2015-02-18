package in.iitkaa.mail.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author Alok
 * @since 18-02-2015
 */
@Result(name = IitkaaActionSupport.SUCCESS, location = "mail.jsp")
public class MailAction extends IitkaaActionSupport {

    @Override
    @Action("/")
    public String execute() throws Exception {
        return super.execute();
    }
}
