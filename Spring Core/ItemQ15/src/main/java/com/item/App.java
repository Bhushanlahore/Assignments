package com.item;

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
    	
    	Customer c1 = (Customer) context.getBean("c1");
    	c1.name();
    	c1.show();
    	Customer c2 = (Customer) context.getBean("c2");
    	c2.show();
    }
}
