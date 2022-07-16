package com.newemployee;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bydate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee1> emp1 = new ArrayList<Employee1>();
		emp1.add(new Employee1(1, "Vikram thakur", LocalDate.of(1999, 03, 12), LocalDate.of(2020, 01, 01), LocalDate.of(2021, 01, 01), "Pune", "Development", 50000));
		emp1.add(new Employee1(2, "Sagar Raut", LocalDate.of(1995, 03, 11), LocalDate.of(2018, 01, 01), LocalDate.of(2020, 01, 01), "Banglore", "Development", 67000));
		emp1.add(new Employee1(3, "Nikhi Gaikwad", LocalDate.of(1998, 03, 12), LocalDate.of(2021, 01, 01), LocalDate.of(2022, 01, 01), "Pune", "Finance", 25000));
		emp1.add(new Employee1(4, "Bhushan Lahore", LocalDate.of(1998, 03, 12), LocalDate.of(2019, 03, 21), LocalDate.of(2022, 01, 01), "Mumbai", "Development", 250000));
		emp1.add(new Employee1(5, "Sahil Lal", LocalDate.of(1995, 06, 22), LocalDate.of(2015, 01, 01), LocalDate.of(2020, 01, 01), "Dehli", "SAP", 54000));
		emp1.add(new Employee1(6, "Pratik Pund", LocalDate.of(1990, 03, 21), LocalDate.of(2015, 11, 16), LocalDate.of(2017, 11, 11), "Dehli", "Account", 99000));
	
		

		
		emp1.stream().map((z) ->Period.between(z.getDoj(), z.getDor()).getYears()).collect(Collectors.toList())
		.forEach(x->System.out.println(x));
		System.out.println();
		
	
		
		System.out.println();
		
	}

}
