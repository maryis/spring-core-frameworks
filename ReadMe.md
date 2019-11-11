this project contains basic concepts/frameworks of Spring (IOC/DI,AOP).it contains 5 isolated subproject:
1- iocBeansDep
all beans and their dependencies are in xml config file, so we used line bellow to get context and then beans:
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("iocBeansDep/spring.xml");
    Person person = (Person) Spring.getBean("p");
there is no annotation. it contains composite dependency 

2- iocParentChildDep
same as 1, but this one shows parent-child dependency

3- iocUsingAnnotation
we active spring component scan in xml config file by:
    <context:component-scan base-package=" iocUsingAnnotation"/>
and then we annotate our components!!!. component scan take care of dependencies by @Component,@Autowierd,@Scope,@Qualifier 
we use ClassPathXmlApplicationContext to get beans

4- iocBeansDepJavaConfig
in this project we used java-based configuration file instead of xml and we define beans by @Bean
so we use AnnotationConfigApplicationContext to get beans

5- aopPackage
this one show an aop in spring using xml annotation. we active IOC and AOP :
    <aop:aspectj-autoproxy/>
    <context:component-scan base-package="aopPackage" />
then we define our @Aspect class(es). each Aspect can have different types of Advice
read more about Advice types, jointpoint and pointcuts in Rater class
