package com.nimap.infotech.exceptionhandling;

public class TryCatchFinallyCondtion2 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello1");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
