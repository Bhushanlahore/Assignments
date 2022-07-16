package com.singletone;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletoneTest {

	@Test
	void test() {
		
		Singletone instance1 = Singletone.getInstance();
		Singletone instance2 = Singletone.getInstance();
		
		assertSame("2 objects are same", instance1, instance2);
		
	}

}
