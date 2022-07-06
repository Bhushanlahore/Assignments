package com.MergeArray;

import java.util.Arrays;

public class Array2 {

	private int arr2[]= {23,31,9,5};

	

	public int[] getArr2() {
		return arr2.clone();
	}




	@Override
	public String toString() {
		return "Array2 [arr2=" + Arrays.toString(arr2) + "]";
	}
	
	

}	
