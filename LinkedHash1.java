package com.satish.collectionsapps;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {


		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(null);
		set.add(20L);
		set.add("satish");
		set.add(null);
		System.out.println(set);
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(111);
		set1.add(222);
		set1.add(333);
		set1.add(444);
		set1.add(555);
		for (Integer element : set1) {
			System.out.println(element);
		}

		Iterator<Integer> iterator2 = set1.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}


	}


