package com.nimap.infotech.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorCollectionsTest {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("Sachin");
		vector.add("Virat");
		vector.add("Dhoni");
		vector.add("Rhoit");
		vector.add("KL RAHUL");
		Iterator itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------");

		vector.forEach(System.out::println);

		vector.addElement("YUVI");
		System.out.println("---------");

		vector.forEach(System.out::println);
		System.out.println("---------");
		// checking element is present or not
		if (vector.contains("YUVI")) {
			System.out.println("Element present at " + vector.indexOf("YUVI"));
		} else {
			System.out.println("Not present");
		}
		
		System.out.println("---------");
		//get first element
		System.out.println(vector.firstElement());
		//get lastElement
		System.out.println("---------");
		System.out.println(vector.lastElement());
		
		System.out.println("---------");
		
		System.out.println(vector.capacity());
		System.out.println("---------");
		System.out.println(vector.size());
		
		vector.add("ASHWINI");
		
		System.out.println("--------");
		
		System.out.println(vector.capacity());
		System.out.println("---------");
		System.out.println(vector.size());
		
		System.out.println(vector);
		
		Collections.sort(vector);
		System.out.println("---------");
		vector.forEach(System.out::println);
		
		vector.removeElementAt(0);
		
		System.out.println("---------");
		vector.forEach(System.out::println);
	}

}
