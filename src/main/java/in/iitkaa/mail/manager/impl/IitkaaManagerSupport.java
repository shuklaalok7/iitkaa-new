package in.iitkaa.mail.manager.impl;

import in.iitkaa.mail.adaptor.MailAdaptor;
import in.iitkaa.mail.dao.AlumnusDAO;
import in.iitkaa.mail.dao.GenericDAO;
import in.iitkaa.mail.dao.UserDAO;
import in.iitkaa.mail.manager.AlumnusService;
import in.iitkaa.mail.manager.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alok
 * @since 20-02-2015
 */
@Service
public abstract class IitkaaManagerSupport {

    // Adaptors
    @Autowired
    protected MailAdaptor mailAdaptor;

    // Manager layer
    @Autowired(required = false)
    protected MailService mailService;

    @Autowired(required = false)
    protected AlumnusService alumnusService;

    // DAO Layer
    @Autowired
    public GenericDAO genericDAO;

    @Autowired
    public AlumnusDAO alumnusDAO;

    @Autowired
    public UserDAO userDAO;


}
