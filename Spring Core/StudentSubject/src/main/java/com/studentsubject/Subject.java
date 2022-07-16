package com.studentsubject;

public class Subject {
		
	private int rollno;
	private int maths;
	private int english;
	private int hindi; 
	private int science;
	private int total;

	
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public int getHindi() {
		return hindi;
	}


	public void setHindi(int hindi) {
		this.hindi = hindi;
	}


	public int getScience() {
		return science;
	}


	public void setScience(int science) {
		this.science = science;
	}


	public int getTotal() {
		return maths+science+hindi+english;
	}




	public void displayTotal() {
		int total=0;
		
		total = maths+science+hindi+english;
		System.out.println("Total Marks: "+total);
	}


	@Override
	public String toString() {
		return "Subject [rollno=" + rollno + ", maths=" + maths + ", english=" + english + ", hindi=" + hindi
				+ ", science=" + science + ", total=" + total + "]";
	}
	
	
}
