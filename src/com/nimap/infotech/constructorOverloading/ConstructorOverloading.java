package com.nimap.infotech.constructorOverloading;

public class ConstructorOverloading {
	int id, passoutYear;
	String name, contactNo, collegeName;

	ConstructorOverloading(String contactNo, String collegeName, int passoutYear) {
		this.contactNo = contactNo;
		this.collegeName = collegeName;
		this.passoutYear = passoutYear;
	}

	ConstructorOverloading(int id, String name) {
		this("9899234455", "IIT Kanpur", 2018);
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		ConstructorOverloading s = new ConstructorOverloading(101, "John");
		System.out.println("Printing Student Information: \n");
		System.out.println("Name: " + s.name + "\nId: " + s.id + "\nContact No.: " + s.contactNo + "\nCollege Name: "
				+ s.collegeName + "\nPassing Year: " + s.passoutYear);

	}

}
