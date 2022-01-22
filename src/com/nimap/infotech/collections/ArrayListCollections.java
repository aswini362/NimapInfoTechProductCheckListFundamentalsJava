package com.nimap.infotech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollections {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(344);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Collections.sort(list);
		list.set(2, 12);
		// list.remove(4);
		System.out.println(list);
		System.out.println(list.contains(6));
		System.out.println(list.containsAll(list));
		System.out.println(list.hashCode());
		System.out.println(list.indexOf(3));
		System.out.println(list.size());

		System.out.println(list.get(3));
		System.out.println(list);

		// itrate list element
		System.out.println("-----------");
		// java 8
		list.forEach(System.out::println);
		System.out.println("-----------");
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
