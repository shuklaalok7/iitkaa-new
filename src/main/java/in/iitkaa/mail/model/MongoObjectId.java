package in.iitkaa.mail.model;

import in.iitkaa.mail.annotations.Includable;
import org.bson.types.ObjectId;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Includable
public class MongoObjectId extends ObjectId {
    private String $oid;

    public MongoObjectId() {
        super();
    }

    public MongoObjectId(String $oid) {
        super($oid);
        this.$oid = $oid;
    }

    public ObjectId getObjectId() {
        return new ObjectId(this.$oid);
    }

    @Override
    public String toString()
    {
        return $oid;
    }

    public static MongoObjectId getObjectId(String id) {
        return new MongoObjectId(id);
    }

    @Override
    public int hashCode() {
        return this.getObjectId().hashCode();
    }
}
