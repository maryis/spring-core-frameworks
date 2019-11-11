package aopPackage.model;


import aopPackage.common.Spring;

import java.sql.SQLException;

/**
 * Created by JavaSchool on 6/14/2019.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!when the 'student' bean is in spring scope:");
        Student student = (Student) Spring.getBean("student");

        student.a(5);
        System.out.println("the output:"+student.c(20));  //since c has returned value, its advice method should return Object
        try {
            student.b();
        } catch (SQLException e) {
            //no need to implement here, there is an aspect to handle it
        }

        System.out.println("!!!!!!!!!when the 'student' bean is noooooot in spring scope:");
        Student student1=new Student();
        student1.a(5);
        System.out.println("the output:"+student1.c(20));  //since c has returned value, its advice method should return Object
        try {
            student1.b();
        } catch (SQLException e) {
            //no need to implement here, there is an aspect to handle it
        }


    }
}
