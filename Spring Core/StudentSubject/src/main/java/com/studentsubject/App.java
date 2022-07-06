package com.studentsubject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Student s1 = (Student) context.getBean("stud1");
       s1.display();
       Student s2 = (Student) context.getBean("stud2");
       s2.display();
       Student s3 = (Student) context.getBean("stud3");
       s3.display();
       Student s4 = (Student) context.getBean("stud4");
       s4.display();
       Student s5 = (Student) context.getBean("stud5");
       s5.display();
       
       
    }
}
