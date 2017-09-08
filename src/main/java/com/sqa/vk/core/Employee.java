package com.sqa.vk.core;

public class Employee extends Person {

	private double salary;

	private String department;

	/**
	 * @param gender
	 * @param age
	 * @param occupation
	 */
	public Employee(String gender, int age, String occupation) {
		super(gender, age, occupation);
	}

	public String getDepartment() {
		return this.department;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [salary=" + this.salary + ", department=" + this.department + "]";
	}
}
