package com.nimap.infotech.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("India");
		sortedSet.add("Australia");
		sortedSet.add("South Africa");
		sortedSet.add("NZ");
		sortedSet.add("India");

		System.out.println(sortedSet);
		sortedSet.remove("Australia");

		System.out.println("Set after removing " + "Australia:" + sortedSet);

		System.out.println(sortedSet);

		Iterator<String> itr = sortedSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("------------");
		System.out.println("Contains " + " :" + sortedSet.contains("India"));

		System.out.println("First Value " + sortedSet.first());

		// Print the last element in
		// the SortedSet
		System.out.println("Last Value " + sortedSet.last());

		sortedSet.add("E");

		System.out.println(sortedSet);
		System.out.println("------------");
		sortedSet.remove("E");

		System.out.println("After removing element " + sortedSet);
		System.out.println("------------");
		System.out.print("Element greater than or equal to G in set is : " + sortedSet.tailSet("I"));
		SortedSet<Integer> s = new TreeSet<>();

		// Adding Element to SortedSet
		s.add(1);
		s.add(5);
		s.add(2);
		s.add(3);
		s.add(9);

		// Returning the set with elements
		System.out.print("Elements greater than or equal to 5 in set are : " + s.tailSet(5));
	}

}
