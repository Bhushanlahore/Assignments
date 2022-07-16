package com.clone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.validator.PublicClassValidator;

class CloneTest {

	@Test
	void test() throws CloneNotSupportedException {
		Clone c1 = new Clone(1, "Hello");
		Clone c2 = (Clone)c1.clone();
		
		assertEquals(true, Clone.clone1(c1, c2));
	}

}
