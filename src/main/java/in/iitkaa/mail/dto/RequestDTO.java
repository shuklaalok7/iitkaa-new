package in.iitkaa.mail.dto;

import in.iitkaa.mail.model.PersistentObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alok
 * @since 20-02-2015
 */
@Getter
@Setter
public abstract class RequestDTO<T extends PersistentObject> {
}
