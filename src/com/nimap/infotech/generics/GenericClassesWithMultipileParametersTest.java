package com.nimap.infotech.generics;

public class GenericClassesWithMultipileParametersTest {

	public static void main(String[] args) {
		GenericClassesWithMultipileParameters<String, Integer> withMultipileParameters = new GenericClassesWithMultipileParameters<String, Integer>(
				"Aswini", 15);
		withMultipileParameters.print();
	}

}
