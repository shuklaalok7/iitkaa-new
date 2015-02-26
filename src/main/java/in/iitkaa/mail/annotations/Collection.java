package in.iitkaa.mail.annotations;

import in.iitkaa.mail.util.GlobalConstants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Collection {
    public String value() default GlobalConstants.BLANK;
}
