package com.calculator;

public class Calculator {
		
	
	public static int add(int a , int b) {
		return a+b;
	}
	
	
	public static int sub(int a , int b) {		
		return a-b;	
	}
	
	
	public static int mul(int a , int b) {
		return a*b;	
	}
	
	
	public static int div(int a , int b) {
		int result = 0;
		try {
			result = a/b;
	
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		return a/b;	
	}
	
	static double sqr(int a)
    {
        return Math.sqrt(a);
    }
	
	static double cube(int a)
    {
        return Math.cbrt(a);
    }
	
	public static int mod(int a, int b) {
	   
		return a%b;
	}
	
	static double power(int N, int P)
    {
		if (N > 0 && P > 0) {
			
			 return Math.pow(N, P);
		}
		else 
		{
			return Math.pow(N, P); 
		}    
    }

	
}
