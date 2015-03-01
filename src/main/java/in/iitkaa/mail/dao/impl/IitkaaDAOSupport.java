package in.iitkaa.mail.dao.impl;

import com.nishionline.struts.core.dao.DAOSupport;
import in.iitkaa.mail.dao.AlumnusDAO;
import in.iitkaa.mail.dao.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Alok
 * @since 26-02-2015
 */
@Repository
public abstract class IitkaaDAOSupport extends DAOSupport {

    @Autowired(required = false)
    protected AlumnusDAO alumnusDAO;

    @Autowired(required = false)
    protected GenericDAO genericDAO;

}
