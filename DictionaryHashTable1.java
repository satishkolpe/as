package com.satish.collectionsapps;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryHashTable1 {

	public static void main(String[] args) {

		Dictionary<Character, String> dict = new Hashtable<>();
		dict.put('A', "apple");
		dict.put('B', "ball");
		dict.put('C', "cat");
		dict.put('D', "door");
		System.out.println(dict);
		Enumeration<Character> keys1 = dict.keys();
		while (keys1.hasMoreElements()) {
			System.out.println(keys1.nextElement());
		}
		Enumeration<String> keys2 = dict.elements();
		while (keys2.hasMoreElements()) {
			System.out.println(keys2.nextElement());
		}
	}

}
