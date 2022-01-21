package com.nimap.infotech;

public class EncapsulationTest {

	private String name;
	private String addres;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAccessException {
		if (age <= 0) {
			this.age = age;
			throw new IllegalAccessException("number is less than zero");

		}
	}

	public static void main(String[] args) throws IllegalAccessException {
		EncapsulationTest encapsulationTest = new EncapsulationTest();
		encapsulationTest.setAddres("berhampur");
		encapsulationTest.setAge(52);
		encapsulationTest.setName("Aswini");
		System.out.println(encapsulationTest.getAddres()+" "+encapsulationTest.getName()+" "+encapsulationTest.getAge());

	}

}
