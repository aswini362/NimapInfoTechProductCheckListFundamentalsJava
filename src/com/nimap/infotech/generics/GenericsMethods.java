package com.nimap.infotech.generics;

public class GenericsMethods {
	public static <T extends Comparable<T>> T max(T first, T second) {
		return (first.compareTo(second) < 0) ? second : first;
	}

	public static void main(String[] args) {
		System.out.println(GenericsMethods.max(20, 30));
	}

}
