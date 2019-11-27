package com.mkong.javafetures.models;

public class Developer {

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Developer(String name, int id, String salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	private String name;

	
	  @Override public String toString() { return "Developer [name=" + name +
	  ", id=" + id + ", salary=" + salary + "]"; }
	 
	private int id;

	private String salary;
}
