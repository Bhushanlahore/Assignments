package com.newemployee;

public class Employee {

	private int id;
	private String name;
	private String dob;
	private String doj;
	private String dor;
	private String location;
	private String deptartment;
	private int salary;
	
	public Employee(int id, String name, String dob, String doj, String dor, String location, String deptartment,
			int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.location = location;
		this.deptartment = deptartment;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDor() {
		return dor;
	}

	public void setDor(String dor) {
		this.dor = dor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDeptartment() {
		return deptartment;
	}

	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nid: " + id + ", \nname: " + name + ", \nDate of Birth: " + dob + ",\nDate of Joining: " + doj + ",\nDate of resign: " + dor
				+ ",\nlocation: " + location + ",\ndeptartment: " + deptartment + ",\nsalary: " + salary+"\n";
	}
	
	
}
