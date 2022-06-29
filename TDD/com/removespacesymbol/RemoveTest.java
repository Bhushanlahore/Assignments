package com.removespacesymbol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveTest {

	@Test
	void test() {
		
		String expected="This Red car.";
		
		String actual = Remove.removeCharecters("This@ Red $car-.");
		
		assertEquals(actual, expected);
	}

}
