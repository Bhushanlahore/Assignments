package com.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(1, "Rahul", 15000));
		emp.add(new Employee(2, "Rohan", 18000));
		emp.add(new Employee(3, "Bhushan", 25000));
		emp.add(new Employee(4, "Sahil", 19000));
		emp.add(new Employee(5, "vipin", 26000));
		emp.add(new Employee(6, "shubham", 50000));
		emp.add(new Employee(7, "Aziz", 20000));
		emp.add(new Employee(8, "Ashok", 30000));
		emp.add(new Employee(9, "pratik", 17000));
		emp.add(new Employee(10, "Sagar", 34000));
		
	
//		Map<Integer, String> mapEmp = emp.stream().
//				collect(Collectors.toMap(Employee:: getId, Employee::getName,
//						Employee::getSalary,(x,y,z) -> x +", "+ y+", "+z, Map::new));

		Map<Integer, Employee> mapEmp = emp.stream().collect(Collectors
				.toMap(e -> e.getId(), e->e));
				
				mapEmp.forEach(
	            (x, y) -> System.out.println(x + " = " + y));
		
	}
	



}
