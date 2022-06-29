package com.vowel;

public class CountVowel {

	
	public static int Count(String str) {
		
		int n = str.length();
		int count =0;
		
		for(int i=0; i<n; i++) {
			
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
			|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				
				count++;
			}
		}
	
		return count;
	}
}
