package com.newemployee;

import java.time.LocalDate;

public class Employee1 {

	private int id;
	private String name;
	private LocalDate dob;
	private LocalDate doj;
	private LocalDate dor;
	private String location;
	private String deptartment;
	private int salary;
	
	
	
	
	public Employee1() {
		super();
	}
	public Employee1(int id, String name, LocalDate dob, LocalDate doj, LocalDate dor, String location,
			String deptartment, int salary) {
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
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
		return "Employee1 [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor
				+ ", location=" + location + ", deptartment=" + deptartment + ", salary=" + salary + "]";
	}
	
	
}
