package com.pythagoras;

public class Pythagoras {

	public static String checkPythagoras(int a, int b, int c) {
		
		if(a*a + b*b == c*c ||
		   b*b + c*c == a*a ||
		   c*c + a*a == b*b) {
			
			return	"Satisfy Pythagoras Templete";
		}
		else {
			return "Not Satisfy";
		}
	}
	
	
}
