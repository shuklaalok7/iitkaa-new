package in.iitkaa.mail.dao.impl;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import in.iitkaa.mail.dao.AlumnusDAO;
import in.iitkaa.mail.dao.GenericDAO;
import in.iitkaa.mail.model.PersistentObject;
import in.iitkaa.mail.util.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.net.UnknownHostException;

import static java.lang.String.format;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Repository
public abstract class IitkaaDAOSupport {
    private static final String TAG = IitkaaDAOSupport.class.getSimpleName();
    private MongoClient mongoClient;
    private DB db;

    @Autowired
    protected AppConfig appConfig;

    @Autowired(required = false)
    protected AlumnusDAO alumnusDAO;

    @Autowired(required = false)
    protected GenericDAO genericDAO;

    public void init() {
        try {
            this.mongoClient = new MongoClient(this.appConfig.getDatabaseHost(), this.appConfig.getDatabasePort());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.err.println(format("%s: %s %s:%d.", TAG, "Mongo DB is not found at",
                    this.appConfig.getDatabaseHost(), this.appConfig.getDatabasePort()));
        }
    }

    private DB getDb() {
        if (this.db == null) {
            this.db = this.mongoClient.getDB(this.appConfig.getDatabaseName());
        }
        return db;
    }

    protected <T extends PersistentObject> DBCollection getCollection(Class<T> tClass) {
        return this.getDb().getCollection(PersistentObject.getCollectionName(tClass));
    }

}
