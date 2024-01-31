package com.day11.markerinterface;

public class Regestrabledemo {

	public static void main(String[] args) {
		
		student st = new student("cibi",123,"ece",10000);
		
		
		if(st instanceof Regestrable) {
			System.out.println("regestered for the course");
		}
		else {
			System.out.println("not regestered for course");
		}
		System.out.println(st);
	}

}
