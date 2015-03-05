package in.iitkaa.mail.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author Alok
 * @since 02-03-2015
 */
@Namespace("/")
@Result(name = IitkaaActionSupport.SUCCESS, location = "index.jsp")
public class HomeAction extends IitkaaActionSupport {

    @Override
    @Action("/")
    public String execute() throws Exception {
        return super.execute();
    }
}
