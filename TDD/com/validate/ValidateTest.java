package com.validate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateTest {

	@Test
	void test() {

		Validate v = new Validate();
		 
		boolean expected = true;
		
		boolean actual = v.isValidate("bhushan@gmail.com", "123");
		
		assertEquals(actual, expected);
	}
	
	

}
