package com.cov.beans;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Invoking parameter constructor");
	}
	public Student() {
		super();
		System.out.println("Invoking no para constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Invoking setId with"+id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
