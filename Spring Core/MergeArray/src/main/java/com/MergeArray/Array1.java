package com.MergeArray;

import java.util.Arrays;

public class Array1 {

	private int arr1[]= {32,55,43};

	
	public int[] getArr1() {
		return arr1.clone();
	}


	@Override
	public String toString() {
		return "Array1 [arr1=" + Arrays.toString(arr1) + "]";
	}
	
	
	
}
