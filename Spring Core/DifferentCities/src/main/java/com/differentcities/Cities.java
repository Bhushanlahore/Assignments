package com.differentcities;

public class Cities {

	private String city1;
	private String city2;
	private int distance;
	
	public String getCity1() {
		return city1;
	}
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	public String getCity2() {
		return city2;
	}
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "Cities [city1=" + city1 + ", city2=" + city2 + ", distance=" + distance + "]";
	}
	
	
}
