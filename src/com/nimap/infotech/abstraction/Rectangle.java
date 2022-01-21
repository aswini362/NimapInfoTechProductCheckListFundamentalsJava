package com.nimap.infotech.abstraction;

public class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String colour, double length, double width) {
		super(colour);
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.getColor() + "and area is : " + area();
	}
}
