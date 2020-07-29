package com.capg;

public class Employee {

	int employeeId;
	String employeeName;
	double salary;
	String bussinessUnit;
	int age;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getBussinessUnit() {
		return bussinessUnit;
	}



	public void setBussinessUnit(String bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Employee Details \nEmployeeId :" + employeeId + "\nEmployeeName :" + employeeName + "\nEmployee Salary :" + salary
				+ "\nEmployee BU :" + bussinessUnit + "\nEmployee Age :" + age ;
	}
	
	
	
}
