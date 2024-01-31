package com.day6.staticvar;

public class Employee {
	private String name;
	private int id;
	static String companyName = "TNS";
	static float salary = 6969.69f;
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

	

}
