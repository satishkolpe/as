package com.satish.collectionsapps;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
// not allow null,only homo

		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(111);
		set1.add(878);
		set1.add(222);
		set1.add(333);
		set1.add(444);
		set1.add(555);
		// SORTED SET METHOD (LAST,FIRST,HEADSET,TAILSET,SUBSET)

		System.out.println(set1.first());
		System.out.println(set1.last());
		System.out.println(set1.headSet(500));// below 500
		System.out.println(set1.tailSet(200));// above 200
		System.out.println(set1.subSet(300, 800));
// NAVIGABLE SET METHOD HIGHER,CEILING,FLOOR,LOWER, pollfisrt,polllast,decendingset
		System.out.println(set1.higher(300));// just one element higher than 300
		System.out.println(set1.lower(300));//just one element lower than 300
		System.out.println(set1.ceiling(300));// equal to or higher
		System.out.println(set1.floor(400));// equal to or below
        System.out.println(set1.pollFirst());
        System.out.println(set1.pollLast());
        System.out.println(set1.descendingSet());//555,444,333,222
	}
}
