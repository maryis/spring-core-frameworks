package iocParentChildDep.model;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Manager2 implements ManagerIX{

    public Manager2() {
        System.out.println("create Manager2");
    }

    public void a()
    {
        System.out.println("Manager2");
    }
}
