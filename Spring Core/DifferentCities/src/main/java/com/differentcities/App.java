package com.differentcities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    	List<Cities> citi = new ArrayList<Cities>();
     	
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Cities citi1 = (Cities) context.getBean("c1");
    	Cities citi2 = (Cities) context.getBean("c2");
    	Cities citi3 = (Cities) context.getBean("c3");
    	Cities citi4 = (Cities) context.getBean("c4");
    	Cities citi5 = (Cities) context.getBean("c5");
    	
    	citi.add(citi1);
    	citi.add(citi2);
    	citi.add(citi3);
    	citi.add(citi4);
    	citi.add(citi5);
        
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the City 1");
    	String city1 = sc.next();
    	
    	System.out.println("Entet the city 2");
    	String city2 = sc.next();
    	
    	List<Cities> l1 = citi.stream().filter(a->a.getCity1().equalsIgnoreCase(city1)).filter(b->b.getCity2().equalsIgnoreCase(city2)).toList();
    	
    	if(!l1.isEmpty()) {
    		for(Cities cities: l1) {
    			
    			System.out.println("Distance from "+ cities.getCity1()+" To "+ cities.getCity2()+" is "+cities.getDistance()+" KM");
    		}
    	}
    	else
    	{
			System.out.println("Not Found");
		}
    }
}
