package in.iitkaa.mail.dao.impl;

import com.mongodb.BasicDBObject;
import in.iitkaa.mail.dao.GenericDAO;
import in.iitkaa.mail.dto.RequestDTO;
import in.iitkaa.mail.dto.ResponseDTO;
import in.iitkaa.mail.model.MongoObjectId;
import in.iitkaa.mail.model.PersistentObject;
import org.springframework.stereotype.Repository;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Repository("GenericDAO")
public class GenericDAOImpl extends IitkaaDAOSupport implements GenericDAO {
    @Override
    public <T extends PersistentObject> T get(MongoObjectId _id) {
        return null;
    }

    @Override
    public <T extends PersistentObject> ResponseDTO<T> search(RequestDTO<T> requestDTO) {
        return null;
    }

    @Override
    public <T extends PersistentObject> void delete(Class<T> tClass, MongoObjectId _id) {
        this.getCollection(tClass).remove(new BasicDBObject("_id", _id.getObjectId()));
    }
}
