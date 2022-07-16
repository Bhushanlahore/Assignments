package com.singletone;

public class Singletone {

	private static Singletone single_instance = null;
	
	private Singletone() {
		System.out.println("this is singletone class");
	}
	
	 public static Singletone getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new Singletone();
	 
	        return single_instance;
	    }
	 
	 public static void main(String[] args) {
		
		 Singletone x = Singletone.getInstance();
		 Singletone y = Singletone.getInstance();
		 
		 System.out.println(x);
		 System.out.println(y);
		 
		 
		}
	}

