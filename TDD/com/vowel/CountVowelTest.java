package com.vowel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountVowelTest {

	@Test
	void test() {
		
		int expected = 5;
		
		int actual = CountVowel.Count("Bhushan Lahore");
		
		assertEquals(expected, actual);
	}

}
