package com.nimap.infotech.addition;

public class MethodOverloading {
	public static int add(int i, int i1) {
		return i + i1;
	}

	public static int add(int i, int i1, int i3) {
		return i + i1 + i3;
	}

	public static double add(double i, double i1, double i3) {
		return i + i1 + i3;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10.3, 20.2, 30.5));
	}

}
