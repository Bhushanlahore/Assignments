package com.predicate;

import java.util.function.Predicate;

public class PredicateEvenOdd {

	public static void main(String args[]) {
		
		Predicate<Integer> even = i -> (i%2==0);
		
		System.out.println(even.test(18));
	}
}
