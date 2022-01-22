package com.nimap.infotech.generics;

public class GenericClassesWithMultipileParameters<T, U> {
	T obj1;
	U obj2;

	GenericClassesWithMultipileParameters(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
