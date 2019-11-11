package iocUsingAnnotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by JavaSchool on 6/14/2019.
 */
@Repository  //no name, so the name would be person
@Scope("singleton")
public class Person {

    @Autowired //its child (ref in xml)  //it is equivalent with @Inject in CDI Spec
    @Qualifier("y") //here it is obligatory, because there is two type of CARIX
    private CarIX carIX;

    public CarIX getCarIX() {
        return carIX;
    }

    public void setCarIX(CarIX carIX) {
        this.carIX = carIX;
    }
}
