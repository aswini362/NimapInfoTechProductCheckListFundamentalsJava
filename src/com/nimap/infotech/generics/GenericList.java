package com.nimap.infotech.generics;

public class GenericList<T> {
	private T[] items = (T[]) new Object[10];
	private int count;

	public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}

	public static void main(String[] args) {
		GenericList<Integer> genericList = new GenericList<Integer>();
		genericList.add(11);
		genericList.get(0);
	}

}
