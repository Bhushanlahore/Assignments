package com.nopalindrone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoPalindroneTest {

	@Test
	void test() {
		
		assertTrue(NoPalindrone.checkNo(111));
	}
	
	@Test
	void test1() {
		
		assertFalse(NoPalindrone.checkNo(123));
	}

}
