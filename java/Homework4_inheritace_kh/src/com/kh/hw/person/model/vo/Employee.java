package com.kh.hw.person.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	public Employee(String name, int age, double weight, double height, int salary, String dept) {
		super(age,weight,height);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
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
		return super.toString()+"���� : "+ salary + "���� : " + dept;
	}

}
