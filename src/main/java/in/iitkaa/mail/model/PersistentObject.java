package in.iitkaa.mail.model;

import in.iitkaa.mail.annotations.Collection;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Alok
 * @since 20-02-2015
 */
@Getter
@Setter
public abstract class PersistentObject implements Serializable, Comparable<PersistentObject> {
    private MongoObjectId _id;

    private Date lastUpdatedOn;
    private Date createdOn;

    private boolean inactive;
    private boolean deleted;

    public boolean isTransient() {
        return this.get_id()==null;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof PersistentObject && ((PersistentObject) object).get_id().equals(this.get_id());
    }

    @Override
    public int hashCode() {
        return this.get_id().hashCode();
    }

    @Override
    public int compareTo(PersistentObject persistentObject) {
        if(persistentObject == null) {
            return 1;
        }

        if(this.getCreatedOn() != null) {
            if (persistentObject.getCreatedOn() != null) {
                return this.getCreatedOn().compareTo(persistentObject.getCreatedOn());
            } else {
                return -1;
            }
        } else {
            return persistentObject.getCreatedOn() != null ? 1 : 0;
        }
    }

    public static <T extends PersistentObject> String getCollectionName(Class<T> tClass) {
        for(Class parent = tClass; parent == PersistentObject.class; parent = parent.getSuperclass()) {
            if(parent.isAnnotationPresent(Collection.class)) {
                return ((Collection)(parent.getAnnotation(Collection.class))).value();
            }
        }

        return tClass.getSimpleName();
    }
}
