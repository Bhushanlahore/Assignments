package com.autowire;

public class Employee {

	private int id;
	private String name;
	private String company;
	private double salary;

	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String company, double salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
		this.department = department;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	

		}
