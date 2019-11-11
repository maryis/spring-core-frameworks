package iocParentChildDep;

import iocParentChildDep.common.Spring;
import iocParentChildDep.model.ManagerIX;

import java.util.Scanner;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println("enter something...");
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equals("new"))
            {                Spring.init();
            }
            ManagerIX manager = (ManagerIX) Spring.getBean("x");
            manager.a();

            manager= (ManagerIX) Spring.getBean("y");
            manager.a();

        }
    }
}
