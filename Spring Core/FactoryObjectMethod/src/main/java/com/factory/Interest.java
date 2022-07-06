package com.factory;

abstract class Interest {
	
	protected double rate;
	abstract void getRate();
	
	public void calculateInterest(int amount, int year ) {
		System.out.println((rate * amount *year)/100);
	}
}
