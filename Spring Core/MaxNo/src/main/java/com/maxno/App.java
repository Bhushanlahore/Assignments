package com.maxno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       MaxNo m= (MaxNo) context.getBean("m1");
       
       System.out.println(m.getNumbers());
       
       List<Integer>list=new ArrayList<Integer>(m.getNumbers());    
       
       int max = list.stream().mapToInt(a -> a).max().getAsInt();
       System.out.println("Maximum value is :"+max);
       
       
       
       
       
    }
}
