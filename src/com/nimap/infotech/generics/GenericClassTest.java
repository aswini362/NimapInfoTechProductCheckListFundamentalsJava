package com.nimap.infotech.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		Test<String> sObj = new Test<String>("AswiniKumarMohanty");
		System.out.println(sObj.getObject());
	}

}
