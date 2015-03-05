package in.iitkaa.mail.action;

import in.iitkaa.mail.model.User;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author Alok
 * @since 27-02-2015
 */
@Getter
@Setter
@Result(name = IitkaaActionSupport.SUCCESS, location = "login.jsp")
public class LoginAction extends IitkaaActionSupport {

    private String username;
    private String password;
    private boolean rememberMe;
    private boolean error;

    @Override
    public void prepare() throws Exception {
        super.prepare();
        String[] errors = this.parameters.get("error");
        if(ArrayUtils.isNotEmpty(errors)) {
            this.error = Boolean.parseBoolean(errors[0]);
        }
    }

    @Override
    @Action(value = "/login")
    public String execute() throws Exception {
        return super.execute();
    }

    @Action(value = "/checkLogin", results = {
            @Result(name = IitkaaActionSupport.SUCCESS, location = "/mail"),
            @Result(name = IitkaaActionSupport.ERROR, location = "/login?error=true"),
    })
    public String login() {
        if(validateUserInput()) {
            User user = this.getUserService().getUserByUsername(this.username);
        }
        return IitkaaActionSupport.ERROR;
    }

    private boolean validateUserInput() {
        return StringUtils.isNotBlank(this.username)
                && StringUtils.isNotBlank(this.password);
    }

}
