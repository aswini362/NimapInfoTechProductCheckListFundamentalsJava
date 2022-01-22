package com.nimap.infotech.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCollectionSet {

	public static void main(String[] args) {
		Integer[] A = { 22, 45, 33, 66, 55, 34, 77 };
		Integer[] B = { 33, 2, 83, 45, 3, 12, 55 };
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("----------");
		// Finding Union of set1 and set2
		Set<Integer> union_data = new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("Union of set1 and set2 is:");
		System.out.println(union_data);
		/*
		 * List<Integer> list = new ArrayList<Integer>(union_data);
		 * Collections.sort(list); System.out.println(list);
		 */

	}

}
