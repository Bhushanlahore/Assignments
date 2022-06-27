package com.permutation;

import java.util.stream.IntStream;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("", "ABCD");
		
	}
		
	private static void permute(String prefix, String str) {
		
		int n = str.length();
		if (n == 0) 
		{
			
			System.out.println(prefix);
			
		} 
		else 
		{
			IntStream.range(0, n).parallel().forEach(
					i -> permute(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
		}
	}
	}


