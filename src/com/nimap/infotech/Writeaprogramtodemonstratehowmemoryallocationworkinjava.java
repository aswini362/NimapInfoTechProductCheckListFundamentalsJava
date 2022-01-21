package com.nimap.infotech;

public class Writeaprogramtodemonstratehowmemoryallocationworkinjava {

	public static void main(String[] args) {
		Student s1 = new Student(1, "aswini");
		System.out.println(s1);
		Student s2 = s1;
		s2.setName("aswini1");
		System.out.println(s2);
		Student s3 = new Student(3, "Aswini Kumar");
		System.out.println(s3);
	}

}
