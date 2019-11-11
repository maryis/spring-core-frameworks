package iocBeansDepJavaConfig;

import iocBeansDepJavaConfig.common.Spring;
import iocBeansDepJavaConfig.model.Car;
import iocBeansDepJavaConfig.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnnotationConfig {

    @Bean(name = "myCar")
    @Scope(value = "singleton")
    Car getCar(){
        return new Car();
    }

    @Bean(name="person")
    @Scope(value = "prototype")
    Person getPerson(){
        Car car = (Car) Spring.getBean("myCar");
        return new Person("ali","ahmadi",car);
    }
}
