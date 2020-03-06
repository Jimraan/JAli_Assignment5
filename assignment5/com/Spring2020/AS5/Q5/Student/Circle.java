package com.Spring2020.AS5.Q5.Student;

public class Circle extends Point implements Shape {
	double radius;

	//METHODS
	public double getRadius() {
		return radius;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String getName() {
		return "Circle";
	}
	@Override
	public String toString() {
		return "center = " + super.toString() + "; radius = " + radius + 
				"\n   Area = " + getArea() + "; Perimeter = " + getCircumference();
	}
	
	//CONSTRUCTOR
	public Circle(int x, int y, double r) {
		super(x, y);
		radius = r;
	}

}
