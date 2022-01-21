package com.nimap.infotech.exceptionhandling;

public class WithTryCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hello1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(10 / 2);
		}
		System.out.println("hello2");
	}

}
