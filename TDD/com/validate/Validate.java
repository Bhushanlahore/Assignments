package com.validate;

public class Validate {

	
	
public boolean isValidate(String uname, String pass){
		
		String username ="bhushan@gmail.com";
		String password = "123";
		
		if(username.equals(uname) && password.equals(password)) {
			
			return true;
		}
		else {
			return false;
		}
	}
}
