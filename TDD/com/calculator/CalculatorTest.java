package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void add() {
		assertEquals(100, Calculator.add(50,50));
	}
	@Test
	void sub() {
		assertEquals(0, Calculator.sub(100,100));
	}
	@Test
	void mul() { 
		assertEquals(500, Calculator.mul(100, 5));
	}
	@Test
	void div() {
		assertEquals(5, Calculator.div(500, 100));
	}
	@Test
	void mod() {
		assertEquals(15, Calculator.mod(115, 20));
	}
	@Test
	void power() {
		assertEquals(49,Calculator.power(7, 2));
	}
	@Test
	void sqr() {
		assertEquals(4, Calculator.sqr(16));
	}
}
