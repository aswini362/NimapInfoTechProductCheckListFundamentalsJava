package com.nimap.infotech.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetCollectionsOperations {

	public static void main(String[] args) {
		Set<Integer> data = new LinkedHashSet<Integer>();
		data.add(31);
		data.add(11);
		data.add(51);
		data.add(81);
		data.add(31);
		data.add(21);
		System.out.println("data: " + data);

		// add all

		List<Integer> newData = new ArrayList<Integer>();
		newData.add(91);
		newData.add(71);
		newData.add(81);
		data.addAll(newData);

		newData.forEach(System.out::println);
		System.out.println("-------------");
		data.forEach(System.out::println);
		System.out.println("-------------");
		System.out.println(data);

		// contains
		System.out.println("Does the Set contains '91'?" + data.contains(91));
		System.out.println("Does the Set contains '46'?" + data.contains(46));

		// containsAll

		System.out.println(data.containsAll(data));

		// iterator()
		System.out.println("-------------");
		Iterator itr = data.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// remove
		System.out.println("-------------");
		data.remove(91);

		System.out.println(data);
	}

}
