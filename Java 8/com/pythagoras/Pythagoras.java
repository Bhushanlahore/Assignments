package com.pythagoras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.price.Items;

public class Pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {7,9,4,5,3,12,8,1,15,25,20};
		int n = arr.length;
	
		
		Arrays.sort(arr);
	

		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=i+2;k<n; k++) {
					
					int a = arr[i];
					int b = arr[j];
					int c = arr[k];
					
					if(a*a + b*b == c*c) {
						System.out.println(a+" "+b+" "+c);
						
					}
				}
			}
		}
					
	}

}
