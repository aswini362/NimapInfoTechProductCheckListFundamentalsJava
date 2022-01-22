package com.nimap.infotech.generics;

public class Test<T> {
	T obj;
	 // constructor
	Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}
