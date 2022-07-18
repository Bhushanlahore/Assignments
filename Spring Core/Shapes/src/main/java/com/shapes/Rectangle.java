package com.shapes;

public class Rectangle implements Shape{

		private double l;
		private double b;
		
		
	
	public double getL() {
			return l;
		}

		public void setL(double l) {
			this.l = l;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

	public double area() {
		// TODO Auto-generated method stub
			return l*b;
	}

	public double side() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}
	
	

}
