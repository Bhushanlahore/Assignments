package com.pythagoras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PythagorasTest {

	@Test
	void test() {
		
		String expected = "Satisfy Pythagoras Templete";
		
		String actual =	Pythagoras.checkPythagoras(3, 4, 5);
		
		assertEquals(actual, expected);
	}

}
