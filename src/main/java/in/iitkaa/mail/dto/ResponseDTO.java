package in.iitkaa.mail.dto;

import com.nishionline.struts.core.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Getter
@Setter
public abstract class ResponseDTO<T extends PersistentObject> {
    private List<T> searchResults;

}
