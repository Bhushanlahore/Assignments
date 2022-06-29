package com.palidrome;

public class Palindrome {

	public boolean isPalindrome(String str1, String str2) {
		
		String rev1="";
		String rev2="";
		
		for(int i=str1.length()-1; i>=0; i--) {
			rev1 = rev1 + str1.charAt(i);
		}
		for(int j = str2.length()-1; j>=0; j--) {
			rev2 = rev2 + str2.charAt(j);
		}
		
		System.out.println(rev1);
		System.out.println(rev2);
		if(rev1.equals(rev2)) 
			return true;
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		
		Palindrome p = new Palindrome();
		p.isPalindrome("aba", "aba");
	}
}
