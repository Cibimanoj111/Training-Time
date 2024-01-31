package com.day8.finalvar;

public class Final_variable {
	final int x = 180;
	final static int Y;
	final static int Z = 103;
	void change() {
	}
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}
	static {
		Y = 88;
		System.out.println("Value of Y: " + Y);
		System.out.println("value of Z:" +Z);
	}


}
