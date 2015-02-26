package in.iitkaa.mail.dao.impl;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import in.iitkaa.mail.dao.AlumnusDAO;
import in.iitkaa.mail.dao.GenericDAO;
import in.iitkaa.mail.util.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Repository
public abstract class IitkaaDAOSupport {

    private static MongoClient mongoClient;
    private DB db;

    @Autowired
    protected AppConfig appConfig;

    @Autowired(required = false)
    protected AlumnusDAO alumnusDAO;

    @Autowired(required = false)
    protected GenericDAO genericDAO;

    private DB getDb() {
        if (this.db == null) {
            this.db = IitkaaDAOSupport.mongoClient.getDB(this.appConfig.getDatabaseName());
        }
        return db;
    }

}
