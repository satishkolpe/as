package com.satish.collectionsapps;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.add("custred apple");
		list.add("banana");
		list.add(1, "gooseberry");
		list.addFirst("guava");
		System.out.println(list);
		for (String li : list) {
			System.out.println(li);
		}
		System.out.println("========");
		Iterator<String> iterator1 = list.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}
}