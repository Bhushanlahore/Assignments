package com.employeedetails;

import java.util.ArrayList;import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
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

    	List<Employee> list = new ArrayList<Employee>();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Employee e1 = (Employee) context.getBean("e1");
    	Employee e2 = (Employee) context.getBean("e2");
    	Employee e3 = (Employee) context.getBean("e3");
    	Employee e4 = (Employee) context.getBean("e4");
    	Employee e5 = (Employee) context.getBean("e5");
  
    	list.add(e1);
    	list.add(e2);
    	list.add(e3);
    	list.add(e4);
    	list.add(e5);
    	
    	Employee max = list.stream().max((s1 , s2) -> s1.getSalary() > s2.getSalary() ? 1: -1).get();
		System.out.println("Maximum salary of Department: "+max.getSalary());
    	System.out.println("================");
    	
    	System.out.println(" Details of Employee with Highest Salary: ");
		Map<String, Employee> emp =list.stream().collect(Collectors.toMap(e ->e.getDepartment(), e->e, BinaryOperator.maxBy(Comparator.comparingInt(e-> e.getEid()))));
		System.out.println(emp);
		System.out.println("================");
		
		Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
		List<Employee> min = list.stream().filter(a -> a.getSalary() < avg).toList();
		
		System.out.println("Name of employee having salary less than or equal to average salary");
		for(Employee e : min) {
			System.out.println(e.getName()+" : "+e.getSalary());
		}

		System.out.println("================");
		
		System.out.println("Average Salary of each Department: ");
		Map<String, Double> avgsal = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgsal);
    }
}
