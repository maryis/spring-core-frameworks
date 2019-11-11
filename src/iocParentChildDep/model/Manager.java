package iocParentChildDep.model;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Manager implements ManagerIX{

    public Manager() {
        System.out.println("create Manager");
    }

    public void a()
    {
        System.out.println("Manager");
    }
}
