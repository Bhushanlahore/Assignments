package com.evenorodd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EverOrOddTest {

	@Test
	void test() {
	
		assertTrue(EverOrOdd.checkEvenOdd(new int[] {34,6,5,67,99}, 2));
	}
	
	@Test
	void test1() {
	
		assertFalse(EverOrOdd.checkEvenOdd(new int[] {34,6,5,1,99}, 3));
	}

}
