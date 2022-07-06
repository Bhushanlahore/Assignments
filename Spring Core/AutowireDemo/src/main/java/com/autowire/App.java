package com.autowire;

import java.util.List;

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
        Employee e1 = (Employee) context.getBean("e1");
        Employee e2 = (Employee) context.getBean("e2");
        Employee e3 = (Employee) context.getBean("e3");
        Employee e4 = (Employee) context.getBean("e4");
        Employee e5 = (Employee) context.getBean("e5");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        
//        String abcString = e1.getName();
//        if(abcString.equalsIgnoreCase("bhushan")) {
//        	System.out.println("yes");
//        }
    }
}
