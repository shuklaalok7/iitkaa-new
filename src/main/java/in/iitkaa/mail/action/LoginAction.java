package in.iitkaa.mail.action;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alok
 * @since 27-02-2015
 */
@Getter
@Setter
public class LoginAction extends IitkaaActionSupport {

    private String username;
    private String password;
    private boolean rememberMe;

    @Override
    public void prepare() throws Exception {
        super.prepare();
    }
}
