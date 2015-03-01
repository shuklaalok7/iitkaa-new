package in.iitkaa.mail.action;

import com.nishionline.struts.core.actions.ActionSupport;
import com.nishionline.struts.core.utils.ServiceLocator;
import in.iitkaa.mail.manager.AlumnusService;
import in.iitkaa.mail.manager.MailService;
import in.iitkaa.mail.manager.impl.AlumnusServiceImpl;
import in.iitkaa.mail.manager.impl.MailServiceImpl;
import lombok.Getter;
import org.apache.struts2.convention.annotation.*;

/**
 * @author Alok
 * @since 18-02-2015
 */
@Namespace("/")
@ResultPath("/pages")
@ExceptionMappings({
        @ExceptionMapping(exception = "java.lang.Exception", result = "error.jsp")
})
@Result(name = IitkaaActionSupport.ERROR, location = "error.jsp")
public abstract class IitkaaActionSupport extends ActionSupport {

    @Getter
    private String pageTitle;

    // SERVICES
    private MailService mailService;
    private AlumnusService alumnusService;

    protected MailService getMailService() {
        if(this.mailService == null) {
            this.mailService = ServiceLocator.getBean(MailServiceImpl.class);
        }
        return this.mailService;
    }

    protected AlumnusService getAlumnusService() {
        if(this.alumnusService == null) {
            this.alumnusService = ServiceLocator.getBean(AlumnusServiceImpl.class);
        }
        return this.alumnusService;
    }

    @Override
    public void prepare() throws Exception {
        super.prepare();
        this.pageTitle = this.getApplicationConfig().getPageTitle();
    }

}
