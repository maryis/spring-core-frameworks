package iocBeansDepJavaConfig.model;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Person {
    private Car car;
    private String name;
    private String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String family,Car car) {
        this.name = name;
        this.family = family;
        this.car=car;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
