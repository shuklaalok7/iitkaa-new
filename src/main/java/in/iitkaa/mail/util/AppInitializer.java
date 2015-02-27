package in.iitkaa.mail.util;

import in.iitkaa.mail.dao.impl.IitkaaDAOSupport;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Alok
 * @since 27-02-2015
 */
@Component
public class AppInitializer implements InitializingBean {

    @Autowired
    @Qualifier("GenericDAO")
    private IitkaaDAOSupport iitkaaDAOSupport;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing application.");
        try {
            GsonUtils.init();
            this.iitkaaDAOSupport.init();
            System.out.println("Application initialized successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Application could not be initialized properly because of the previous errors.");
        }
    }
}
