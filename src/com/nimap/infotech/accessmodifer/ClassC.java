package com.nimap.infotech.accessmodifer;

public class ClassC extends ClassB {
	protected void dispaly1() {
		System.out.println("DispalyC");
	}

	public static void main(String[] args) {
		ClassC classC = new ClassC();
		classC.dispaly1();
		classC.display();

	}

}
