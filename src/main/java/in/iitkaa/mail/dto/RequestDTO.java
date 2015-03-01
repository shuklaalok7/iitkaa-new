package in.iitkaa.mail.dto;

import com.nishionline.struts.core.models.MongoObjectId;
import com.nishionline.struts.core.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alok
 * @since 20-02-2015
 */
@Getter
@Setter
public abstract class RequestDTO<T extends PersistentObject> {
    private MongoObjectId _id;
}
