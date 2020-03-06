package com.Spring2020.AS5.Q5.Student;

public class ShapeTest {
	public static void main(String[] args) {
		display(new Point(5, 12));
		display(new Circle(9, 19, 5.5));
		display(new Cylinder(20, 30, 3.3, 10.75));
	}
	
	public static void display(Shape s) {
		System.out.println(s.getName() + " location " + s);
	}
}
