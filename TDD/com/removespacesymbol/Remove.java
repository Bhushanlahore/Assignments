package com.removespacesymbol;

public class Remove {

	public static String removeCharecters(String str) {
		
		String newString = str.replaceAll("[@#$%^&*-]", "");
		
		return newString;
	}
	
	
}
