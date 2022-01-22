package com.nimap.infotech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollectionsTest {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Z");
		linkedList.add("B");
		linkedList.add("E");

		linkedList.add("C");
		linkedList.add("A");
		linkedList.add("D");

		Iterator itr = linkedList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		linkedList.forEach(System.out::println);

		Collections.sort(linkedList);
		System.out.println("-----------");
		System.out.println(linkedList);

		linkedList.add(1, "AFG");
		System.out.println("-----------");
		System.out.println(linkedList);

		linkedList.remove(1);
		System.out.println("-----------");
		System.out.println(linkedList);

		System.out.println("-----------");
		System.out.println(linkedList.get(2));
		System.out.println("-----------");

		System.out.println(linkedList.indexOf("C"));

	}

}
