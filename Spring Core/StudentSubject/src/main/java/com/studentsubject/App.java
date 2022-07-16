package com.studentsubject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;

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
    	List<Student> list = new ArrayList<Student>();
    	
       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Student s1 = (Student) context.getBean("stud1");
       Student s2 = (Student) context.getBean("stud2");
   
       Student s3 = (Student) context.getBean("stud3");
     
       Student s4 = (Student) context.getBean("stud4");
    
       Student s5 = (Student) context.getBean("stud5");
      
       list.add(s1);
       list.add(s2);
       list.add(s3);
       list.add(s4);
       list.add(s5);
    
     
       		System.out.println("Marks obtained by each student");
    	   for(Student s: list) {
    		   
    		   System.out.println(s.getName()+": "+s.getSubject().getTotal());
    	   }
       
    	   List<Student> sortedStud = list.stream().sorted((a,b)->Integer.compare(a.getSubject().getTotal(), b.getSubject().getTotal())).toList();
    			   
    	   System.out.println("Marks obtained by each student in sorted order:");
    	   for(Student st: sortedStud) {
    		   
    		   System.out.println(st.getName()+": "+st.getSubject().getTotal());
    	   }
    }
}
