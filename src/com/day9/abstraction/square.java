package com.day9.abstraction;

public class square extends shape {
	private float side;

	public square() {
		side= 77.0f;
	}

	public square(float side) {
		this.side = side;
	}
	void calArea()
	{
		area = side * side;
	}
	
	

}
