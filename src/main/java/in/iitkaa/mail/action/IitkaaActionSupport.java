package in.iitkaa.mail.action;

import com.opensymphony.xwork2.Preparable;
import in.iitkaa.mail.manager.MailService;
import in.iitkaa.mail.util.AppConfig;
import in.iitkaa.mail.util.ServiceLocator;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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
public abstract class IitkaaActionSupport extends DefaultActionSupport implements SessionAware, ServletRequestAware,
        ServletResponseAware, ParameterAware, Preparable {
    protected static final String REDIRECT = "redirect";

    private Map<String, Object> session;
    private Map<String, String[]> parameters;
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;

    private String pageTitle;

    // SERVICES
    protected MailService mailService;

    public MailService getMailService() {
        if(this.mailService == null) {
            this.mailService = ServiceLocator.getBean(MailService.class);
        }
        return this.mailService;
    }

    @Override
    public void prepare() throws Exception {
        this.pageTitle = AppConfig.PAGE_TITLE;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setParameters(Map<String, String[]> parameters) {
        this.parameters = parameters;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.servletRequest = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.servletResponse = response;
    }

}
