package com.shapes;

public class Square implements Shape{

	private double s;
	
	
	
	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double area() {
		// TODO Auto-generated method stub
		return s*s;
	}

	public double side() {
		// TODO Auto-generated method stub
		return s*s*s*s;
	}

	
	
}
