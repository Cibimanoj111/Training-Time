package com.day9.abstraction;

public class abstraction_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1 ;
		s1 = new rectangle();
		s1.calArea();
		s1.show();
		
		s1 = new square();
		s1.calArea();
		s1.show();
		
		square sq = new square();
		sq.calArea();
		sq.show();
		
		rectangle re = new rectangle ();
		re.calArea();
		re.show();

	}

}
