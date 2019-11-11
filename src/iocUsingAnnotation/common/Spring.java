package iocUsingAnnotation.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Spring {
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/iocUsingAnnotation/spring.xml");
    public static Object getBean(String beanId)
    {
        return applicationContext.getBean(beanId);
    }
    public static void init()
    {
        applicationContext = new ClassPathXmlApplicationContext("iocUsingAnnotation/spring.xml");
    }
}
