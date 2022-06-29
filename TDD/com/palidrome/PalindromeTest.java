package com.palidrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		
		Palindrome p = new Palindrome();
		boolean expected = true;
		
		boolean actual =p.isPalindrome("aba", "aba");
		
		assertEquals(actual, expected);
		
		
	}

}
