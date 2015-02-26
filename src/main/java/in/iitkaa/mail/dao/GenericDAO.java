package in.iitkaa.mail.dao;

import in.iitkaa.mail.dto.RequestDTO;
import in.iitkaa.mail.dto.ResponseDTO;
import in.iitkaa.mail.model.MongoObjectId;
import in.iitkaa.mail.model.PersistentObject;

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
    public <T extends PersistentObject> ResponseDTO<T> search(RequestDTO<T> requestDTO);

    /**
     *
     * @param _id
     * @param <T>
     * @return
     */
    public <T extends PersistentObject> boolean delete(MongoObjectId _id);

}
