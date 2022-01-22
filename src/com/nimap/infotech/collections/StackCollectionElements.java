package com.nimap.infotech.collections;

import java.util.ListIterator;
import java.util.Stack;

public class StackCollectionElements {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		boolean results = stack.empty();
		System.out.println(results);
		stack.push(2);
		stack.push(18);
		stack.push(48);
		stack.push(7);
		stack.push(10);
		stack.push(3);
		stack.push(45);
		boolean empty = stack.empty();
		System.out.println(stack);
		System.out.println(empty);

		stack.pop();

		System.out.println(stack);
		stack.peek();
		System.out.println(stack);

		int location = stack.search(8);
		System.out.println("Location of : " + location);

		ListIterator<Integer> listIterator = stack.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
