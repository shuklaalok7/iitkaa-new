package in.iitkaa.mail.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alok
 * @since 17-02-2015
 */
@Getter
@Setter
public class Alumnus {
    private String name;
    private String email;

    public Alumnus() {
    }

    public Alumnus(String name, String email) {
        this();
        this.name = name;
        this.email = email;
    }
}
