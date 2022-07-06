package com.factory;

import java.util.Scanner;

public class Emi {
	
		private double rate;
		
		
		public Emi() {
			
		}
		
		public Emi(double rate) {
			super();
			this.rate = rate;
		}



		public double getRate() {
			return rate;
		}



		public void setRate(double rate) {
			this.rate = rate;
		}



		public void getData() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principle amount");
			int prin = sc.nextInt();
			
			System.out.println("Enter the time period in year");
			int time = sc.nextInt();
			
			rate = rate/(12*100);
			time = time *12;
			double e = prin*rate*(Math.pow(1+rate, time))/(Math.pow(1+rate,time)-1);
			System.out.println("Monthly EMI is: "+e);
			System.out.println("No of EMI in Months: "+(time));					
		}	
}
