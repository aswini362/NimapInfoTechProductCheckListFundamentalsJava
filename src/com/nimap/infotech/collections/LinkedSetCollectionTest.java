package com.nimap.infotech.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetCollectionTest {

	public static void main(String[] args) {
		Set<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");

		linkedset.add("A");
		linkedset.add("E");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());

		System.out.println("Original LinkedHashSet:" + linkedset);

		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));

		System.out.println("Checking if A is present=" + linkedset.contains("A"));
		linkedset.add("F");
		System.out.println("Updated LinkedHashSet: " + linkedset);

		System.out.println("--------------");
		// Iterating though the LinkedHashSet using iterators

		Iterator itr = linkedset.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
