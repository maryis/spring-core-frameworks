package iocBeansDep;

import iocBeansDep.common.Spring;
import iocBeansDep.model.Person;


/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person = (Person) Spring.getBean("p");
 /*       Car car = (Car) Spring.getBean("c");
        person.setCar(car);*/

        //car is not null because of applicationContext.xml config
        person.getCar().start();
        System.out.println(person.getFmaily());
        System.out.println(person.getName());
        System.out.println(person);
        System.out.println(person.getCar());

        //again its not the same person because the bean scope is prototype
        Person p1= (Person) Spring.getBean("p");

        System.out.println(p1.getFmaily());
        System.out.println(p1.getName());
        System.out.println(p1);
        //again its not the same car because the bean scope is singletone
        System.out.println(p1.getCar());


    }
}
