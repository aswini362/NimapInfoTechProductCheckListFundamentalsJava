package com.nimap.infotech.accessmodifer;

public class ClassA {
	/*
	 * private void display() { System.out.println("Private Method"); }
	 */
	public void display() {
		System.out.println("Private Method");
	}

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.display();
		ClassB classB = new ClassB();
		classB.display();

	}

}
