package in.iitkaa.mail.annotations;

import com.nishionline.struts.core.utils.GlobalConstants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alok
 * @since 26-02-2015
 * @deprecated Use one in the strutsBase
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Collection {
    public String value() default GlobalConstants.BLANK;
}
