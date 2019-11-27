package com.mkong.javafetures;

public class Employee {

	public Employee(String name, String marks, int salary) {
		super();
		this.name = name;
		this.marks = marks;
		this.salary = salary;
	}
	public String name;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", marks=" + marks + ", salary=" + salary + "]";
	}
	public String marks;
	public int salary;
}
