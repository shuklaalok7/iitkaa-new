package in.iitkaa.mail.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @author Alok
 * @since 18-02-2015
 * @deprecated use one in the strutsBase
 */
public class ServiceLocator implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ServiceLocator.applicationContext = applicationContext;
    }

    @SuppressWarnings(com.nishionline.struts.core.utils.GlobalConstants.UNCHECKED)
    public <T> T getBean(String beanName) {
        return (T) applicationContext.getBean(beanName);
    }

    public static <T> T getBean(Class<T> clazz) {
        Map<String, T> beans = ServiceLocator.applicationContext.getBeansOfType(clazz);
        if(beans.size() == 1) {
            return beans.get(clazz.getSimpleName());
        } else {
            throw new IllegalArgumentException("More than one beans or no beans of given type are available.");
        }
    }

}
