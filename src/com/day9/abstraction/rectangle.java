package com.day9.abstraction;

public class rectangle extends shape{
	private float width,height;

	public rectangle() {
		width =69.8f;
		height = 99.5f;
	}

	public rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	void calArea()
	{
		area = width * height;
	}
	
	
	
	
	

}
