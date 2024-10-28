package com;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private int id;
	private int sal;
	private String loc;
	
	public Employee() {}

	public Employee(String name, int id, int sal, String loc) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.loc = loc;
	}

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public void display() {
		System.out.println("Employee name:"+getName());
		System.out.println("Employee id:"+getId());
		System.out.println("Employee Salary:"+getSal());
		System.out.println("Employee Location:"+getLoc());
	}
}
