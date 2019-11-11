package aopPackage.model;

import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * Created by JavaSchool on 6/14/2019.
 */
@Component
public class Student {
    public void a(int in) {
        System.out.println("ana a :" +in);
    }

    public void b() throws SQLException {
        System.out.println("ana b");

        throw new SQLException("myErr");
    }

    public  int c(int in){
        return in*in ;
    }
}
