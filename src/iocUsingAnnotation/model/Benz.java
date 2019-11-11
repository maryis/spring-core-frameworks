package iocUsingAnnotation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by JavaSchool on 6/14/2019.
 */
@Component("y")  //@Component @Controller @Repository @Service  these are just stereotype and make code more reusable
@Scope("prototype")

public class Benz implements CarIX {
    @Override
    public void start() {
        System.out.println("ana start benz");
    }
}
