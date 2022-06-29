package com.nopalindrone;

public class NoPalindrone {
		
	public static boolean checkNo(int no) {
		
		int rev=0;
		int temp=0;
		
		int num=no;
		
		while(num!=0) {
			
			temp = num%10;
			rev = temp + (rev*10);
			num = num/10;
		}
		
		if(rev == no)
		{
			return true;
		}else {
			return false;
		}
	}
	
	
}
