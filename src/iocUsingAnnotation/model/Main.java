package iocUsingAnnotation.model;


import iocUsingAnnotation.common.Spring;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //1- bean dependency

        CarIX car = (CarIX) Spring.getBean("x");
        car.start();

        //2- parent-child
        Person person = (Person) Spring.getBean("person");
 /*       BMW car = (BMW) Spring.getBean("c");
        person.setBMW(car);*/
        //no need to set car, because of @Autowired
       person.getCarIX().start();

       //3- using bean in xml (xml along with annotation is OK)
       CarIX car2= (CarIX) Spring.getBean("fileBean");
       car2.start();

    }
}
