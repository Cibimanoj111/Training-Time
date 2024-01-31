package com.day9.abstraction;

public abstract class shape {
	protected float area;

	abstract void calArea();
	
	void show()
	{
		System.out.println("Area is :"+area);
	}

}
