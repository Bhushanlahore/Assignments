package com.shapes;

public class Circle implements Shape{
	
	private double radius;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		// TODO Auto-generated method stub
		return Math.PI *(radius * radius);
		
	}

	public double side() {
		// TODO Auto-generated method stub
		 return 2 * Math.PI* radius;
	}

}
