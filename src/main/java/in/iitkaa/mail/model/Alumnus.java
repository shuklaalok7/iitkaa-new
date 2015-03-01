package in.iitkaa.mail.model;

import com.nishionline.struts.core.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alok
 * @since 17-02-2015
 */
@Getter
@Setter
public class Alumnus extends PersistentObject {
    private String name;
    private String email;
    public String test;

    public Alumnus() {
    }

    public Alumnus(String name, String email) {
        this();
        this.name = name;
        this.email = email;
    }
}
