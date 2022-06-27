package com.series;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		
		for(int i=0; i<arr.length-1; i++) {
				
				if(Math.abs(arr[i] - arr[i+1]) ==1) {
					
					System.out.println(arr[i]+"-"+ arr[i+1]);
				}
			
			
		}
	
	}

}
