package com.nimap.infotech.exceptionhandling;

public class ThrowKeyWordExample {

	public static void main(String[] args) {
		System.out.println(10 / 0);
		throw new AbstractMethodError("By zero");
		//System.out.println("hello");CE: Unreachable code
	}

}
