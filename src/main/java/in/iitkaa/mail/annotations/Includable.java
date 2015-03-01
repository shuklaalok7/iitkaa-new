package in.iitkaa.mail.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation
 * @author Alok
 * @since 26-02-2015
 * @deprecated Use {@link com.nishionline.struts.core.annotations.Embeddable}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Includable {
}
