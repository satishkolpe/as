package com.satish.collectionsapps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashMap map1 = new HashMap();
		map1.put(null, 10);
		map1.put(1, "apple");
		map1.put('B', "banana");
		map1.put('c', 1000L);
		map1.put(null, "satish");
		System.out.println(map1);

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(101, "akash");
		map2.put(102, "rahul");
		map2.put(103, "punam");
		map2.put(109, "akshra");
		System.out.println(map2.size());
		System.out.println(map2.isEmpty());
		System.out.println(map2.containsKey(102));
		System.out.println(map2.containsValue("punam"));
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		System.out.println(map2.entrySet());
		System.out.println(map2.get(101));
		for (Map.Entry<Integer, String> me : map2.entrySet()) {
			System.out.println(me.getKey() + "------>" + me.getValue());
		}

	}

}
