package iocBeansDep.model;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Person {
    private Car car;
    private String name;
    private String fmaily;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFmaily() {
        return fmaily;
    }

    public void setFmaily(String fmaily) {
        this.fmaily = fmaily;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
