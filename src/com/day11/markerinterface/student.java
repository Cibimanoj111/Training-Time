package com.day11.markerinterface;

public class student implements Regestrable {
	private String name;
	private int rollno;
	private String course;
	private double fees;
	public student() {
		super();
	}
	public student(String name, int rollno, String course, double fees) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.course = course;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", course=" + course + ", fees=" + fees + "]";
	}
	
	
	


}
