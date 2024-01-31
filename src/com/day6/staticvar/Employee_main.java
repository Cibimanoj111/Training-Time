package com.day6.staticvar;

public class Employee_main {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		System.out.println(Employee.salary);
	
		Employee e = new Employee("CIBI", 123);
		System.out.println(e);
		e = new Employee("MANOJ", 321);
		System.out.println(e);
	

	}

}
