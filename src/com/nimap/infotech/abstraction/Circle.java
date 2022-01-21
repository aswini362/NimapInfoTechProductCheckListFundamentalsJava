package com.nimap.infotech.abstraction;

public class Circle extends Shape {

	private double radius;

	public Circle(String colour, double radius) {
		super(colour);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor() + "and area is : " + area();
	}

}
