package com.nimap.infotech.exceptionhandling;

public class TryCatchFinallyCondtion4 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello1");
			return;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
