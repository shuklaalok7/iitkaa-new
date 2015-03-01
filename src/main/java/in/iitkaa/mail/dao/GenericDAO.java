package in.iitkaa.mail.dao;

import com.nishionline.struts.core.models.MongoObjectId;
import com.nishionline.struts.core.models.PersistentObject;
import in.iitkaa.mail.dto.RequestDTO;

import java.util.List;

/**
 * @author Alok
 * @since 26-02-2015
 */
public interface GenericDAO {

    /**
     * Retrieve an object by its _id
     * @param _id    The MongoObjectId
     * @param <T>    extends PersistentObject
     * @return T the found object, else null
     */
    public <T extends PersistentObject> T get(MongoObjectId _id);

    /**
     *
     * @param requestDTO
     * @param <T>
     * @return
     */
    public <T extends PersistentObject> List<T> search(Class<T> tClass, RequestDTO<T> requestDTO);

    /**
     *
     * @param tClass
     * @param _id
     * @param <T>
     */
    public <T extends PersistentObject> void delete(Class<T> tClass, MongoObjectId _id);

}
