package iocUsingAnnotation.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("x")  //if we do not mention name, it would be class name with its first character smal
@Scope("prototype")
public class BMV implements CarIX {
    String model;

    @Override
    public void start() {
        System.out.println("start of BMW");

    }
}
