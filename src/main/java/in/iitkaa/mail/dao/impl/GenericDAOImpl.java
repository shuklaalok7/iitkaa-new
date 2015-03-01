package in.iitkaa.mail.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.nishionline.struts.core.models.MongoObjectId;
import com.nishionline.struts.core.models.PersistentObject;
import in.iitkaa.mail.dao.GenericDAO;
import in.iitkaa.mail.dto.RequestDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public <T extends PersistentObject> List<T> search(Class<T> tClass, RequestDTO<T> requestDTO) {
        DBObject searchObject = new BasicDBObject();
        // TODO filter by the fields of RequestDTO
        DBCursor dbCursor = this.getCollection(tClass).find(searchObject);
        return this.fromDbCursor(tClass, dbCursor);
    }

    @Override
    public <T extends PersistentObject> void delete(Class<T> tClass, MongoObjectId _id) {
        this.getCollection(tClass).remove(new BasicDBObject("_id", _id.getObjectId()));
    }
}
