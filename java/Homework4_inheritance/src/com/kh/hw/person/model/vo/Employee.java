package com.kh.hw.person.model.vo;

public class Employee extends Person{
			// Á÷¿ø
	
	private int salary; // ±Þ¿©
	private String dept; // ºÎ¼­
	
	
	public Employee() {
		
	}
	public Employee(String name,int age, double height, double weight, int salary , String dept) {
		this.dept = dept;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return dept;
		
	}
	
	
}