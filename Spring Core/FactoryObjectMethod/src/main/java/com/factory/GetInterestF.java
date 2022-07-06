package com.factory;

public class GetInterestF {

	public Interest getInterest(String bankint) {
		
		if(bankint ==null) {
			return null;
		}
		
		if(bankint.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		else
		if(bankint.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		else if(bankint.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		
		return null;
			
		
	}
}
