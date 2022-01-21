package com.nimap.infotech.abstraction;

public abstract class Shape {
	private String colour;

	public abstract double area();

	public abstract String toString();

	public Shape(String colour) {
		System.out.println("Shape constructor called");
		this.colour = colour;
	}

	public String getColor() {
		return colour;
	}
}
