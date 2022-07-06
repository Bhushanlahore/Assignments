package com.factory;

import java.util.Scanner;

import javax.annotation.PostConstruct;

public class Average {

	
	
	
	@PostConstruct
	public void getData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many no you want to use");
		int n = sc.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the numbers for calculating avarge");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum =0;
		double avg= 0;
		
		for(int i=0; i<n; i++) {
			sum = sum+arr[i];
		}
		
		avg = sum/n;
		
		System.out.println("Average of given no: "+avg);
		}
	
}
