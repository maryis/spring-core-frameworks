package aopPackage.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * Created by JavaSchool on 6/14/2019.
 */
@Aspect
@Order(1) //if there is more than one aspect for a method, the order determines the order of running aspects
//never forgot to enable aspect in xml
@Component
public class Rater {

    //AOP Advice Types

    //@Before Advice: These advices runs before the execution of join point methods.
    //@After (finally) Advice: An advice that gets executed after the join point method finishes executing, whether normally or by throwing an exception.
    //@AfterReturning Advice: Sometimes we want advice methods to execute only if the join point method executes normally.
    //@AfterThrowing Advice: This advice gets executed only when join point method throws exception
    //@Around Advice: This is the most important and powerful advice.

    @Around("execution(* aopPackage.model.Student.a(..)) || execution(* aopPackage.model.Student.b(..))")//it is a pointcut(rule)
    public void forAandB(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("before " + joinPoint.getSignature().getName());
        String args = joinPoint.getArgs().length > 0 ? joinPoint.getArgs()[0].toString() : "no args";
        System.out.printf("the args are :%s \n", args);
        joinPoint.proceed();

        System.out.println("afetr " + joinPoint.getSignature().getName());

    }
    //or using @PointCut
    @Pointcut("execution(* aopPackage.model.Student.c(..))")
    public void cPointCut(){}

    @Around("cPointCut()")
    public Object forC(ProceedingJoinPoint joinPoint) throws Throwable {    //the method has returned value

        System.out.println("before " + joinPoint.getSignature().getName());
        String args = joinPoint.getArgs().length > 0 ? joinPoint.getArgs()[0].toString() : "no args";
        System.out.printf("the args are :%s \n", args);
        Object c = joinPoint.proceed();

        System.out.println("afetr " + joinPoint.getSignature().getName());
        return (int)c + 10;

    }

    //note: the specified methods should throw the exception. so if we have try-catch, the catch block should throw ex
    @AfterThrowing(pointcut = "execution(* aopPackage.model.Student.*(..))", throwing = "ex")
    public void logAfterThrowingAllMethods(Exception ex) throws Exception {
        System.out.println("I handled this exception in aspect: "+ex.getMessage());
    }
}
