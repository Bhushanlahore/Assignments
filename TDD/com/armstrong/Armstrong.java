package com.armstrong;

public class Armstrong {

	public static boolean isArmstrong(int n) {
		
		int num = n;
		int sum=0;
		int temp=0;
		
		while(num!=0) {
			
			temp = num%10;
			sum = sum +(temp * temp * temp);
			num = num/10;
			
		}
		
		if(n==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}
