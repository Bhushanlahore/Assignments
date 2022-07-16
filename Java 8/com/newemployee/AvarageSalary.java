package com.newemployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AvarageSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Shubham Thakur", "12-02-1998", "01-01-2020", "01-01-2021", "Pune", "Finance", 30000));
		emp.add(new Employee(2, "Sagar Raut", "23-04-1995", "01-01-2015", "01-01-2019", "Banglore", "Development", 67000));
		emp.add(new Employee(3, "Nikhi Gaikwad", "10-02-1999", "02-09-2021", "01-05-2022", "Pune", "Finance", 25000));
		emp.add(new Employee(4, "Bhushan Lahore", "09-09-1996", "05-02-2017", "04-10-2018", "Mumbai", "Development", 250000));
		emp.add(new Employee(5, "Sahil Lal", "29-05-1998", "11-09-2019", "01-01-2022", "Dehli", "SAP", 54000));
		emp.add(new Employee(6, "Pratik Pund", "05-01-1997", "19-05-2017", "18-11-2020", "Dehli", "Account", 99000));
	
		System.out.println("Avarage Salary of Each Department:");
		
		Map<String, Double> avgSalary = emp.stream().collect(Collectors.groupingBy(Employee::getDeptartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		
				
	}

}
