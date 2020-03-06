package com.Spring2020.AS5.Q5.Student;

public class Point implements Shape{
	private int x, y;
	
	//METHODS
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getVolume() {
		return 0;
	}

	@Override
	public String getName() {
		return "Point";
	}
	
	
	//CONSTRUCTOR
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	//GETTERS
	int getX() { return x; }
	int getY() { return y; }
}
