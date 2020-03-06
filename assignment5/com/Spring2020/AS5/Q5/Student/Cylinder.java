package com.Spring2020.AS5.Q5.Student;

public class Cylinder extends Circle implements Shape {
	private double height;

	//METHODS
	@Override
	public double getArea() {
		return (2*super.getArea() + 2*Math.PI*radius*height);
	}
	@Override
	public double getVolume() {
		return super.getArea()*height;
	}
	@Override
	public String getName() {
		return "Cylinder";
	}
	@Override
	public String toString() {
		return super.toString() + "\n   height = " + height;
	}
	
	
	//CONSTRUCTOR
	public Cylinder(int x, int y, double r, double h) {
		super(x, y, r);
		height = h;
	}

	//GETTERS
	public double getHeight() { return height; }
}
