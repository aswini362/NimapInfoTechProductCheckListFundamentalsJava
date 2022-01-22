package com.nimap.infotech.generics;

public class List {
	private Object[] items = new Object[10];
	private int count;

	public void add(Object item) {
		items[count++] = item;
	}

	public Object get(int index) {
		return items[index];
	}

	public static void main(String[] args) {
		List list = new List();
		list.add(1);
		list.add("A");
	}
}
