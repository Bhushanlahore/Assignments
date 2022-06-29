package com.evenorodd;

public class EverOrOdd {

	
	public static boolean checkEvenOdd(int[] num,int GivenNoOfEven) {
	
		int n = num.length;
		int count=0;
		
		for(int i=0; i<n; i++)
		{
			if(num[i]%2==0) {
				count++;
			}
		}
		
		if(count == GivenNoOfEven)
			return true;
		else
			return false;
	}
	
}
