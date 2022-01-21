package com.nimap.infotech.abstraction;

import com.nimap.infotech.Demo;

public class AbstractTest {
//https://www.geeksforgeeks.org/abstraction-in-java-2/
	public static void main(String[] args) {
		Shape shape = new Circle("green", 2.2);
		Shape shape2 = new Rectangle("black", 2, 2);
		System.out.println(shape);
		System.out.println(shape2);
		
		Demo d=new Demo();
		d.m1();
		System.out.println(d);

	}

}
