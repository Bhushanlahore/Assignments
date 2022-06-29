package com.string;

public class StringConcate {

	public static String ConcateString(String fruits[]) {
		
		int n = fruits.length;
		String newString = "";
	
		
		for(int i=0; i<n; i++) {
			
			newString = newString.concat(fruits[i]+"-");
	
		}
		return newString.toLowerCase();
	}

}
