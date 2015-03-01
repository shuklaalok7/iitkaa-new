package in.iitkaa.mail.model;

import com.nishionline.struts.core.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import static java.lang.String.format;

/**
 * @author Alok
 * @since 27-02-2015
 */
@Getter
@Setter
public class User extends PersistentObject {
    private String username;
    private String password;
    private String email;

    private String firstName;
    private String lastName;
    private Set<String> roles;

    public String getName() {
        return format("%s %s", this.firstName, this.lastName);
    }

}
