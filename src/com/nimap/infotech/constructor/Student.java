package com.nimap.infotech.constructor;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student student = new Student(12, "aswini");
		student.display();

	}

}
