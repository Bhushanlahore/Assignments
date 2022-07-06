package com.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    	Items it = (Items) context.getBean("i1");

    	System.out.println("Original List: "+it.toString());
    	
    	List<String> l1 = new ArrayList<String>(it.getList());
    	Collections.sort(l1);
    	List<Object> collect = l1.stream().distinct().collect(Collectors.toList());
    	System.out.println("List in ascending order: "+collect);
    	
    	Collections.sort(collect, Collections.reverseOrder());
    	System.out.println("List in descending order: "+collect);
    	
    }
}
