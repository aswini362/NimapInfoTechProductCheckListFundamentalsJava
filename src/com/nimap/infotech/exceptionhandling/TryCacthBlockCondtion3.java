package com.nimap.infotech.exceptionhandling;

public class TryCacthBlockCondtion3 {

	public static void main(String[] args) {
		try {
			System.out.println("Hello1");
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}

}
