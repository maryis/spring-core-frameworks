package iocBeansDepJavaConfig.common;

import iocBeansDepJavaConfig.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Spring {
    private static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    public static Object getBean(String beanId)
    {
        return applicationContext.getBean(beanId);
    }
    public static void init() {
        applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    }
}
