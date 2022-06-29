package com.armstrong;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void test() {
		
//		boolean expected = true;
//		
//		boolean actual = Armstrong.isArmstrong(153);
//		
//		assertEquals(expected, actual);
		
		
		assertTrue(Armstrong.isArmstrong(153));
	}

}
