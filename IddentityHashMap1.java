package com.satish.collectionsapps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IddentityHashMap1 {

	public static void main(String[] args) {
           
		Long uid1=new Long(1200000102L);
		Long uid2=new Long(1200000102L);
		//hashmap uses internally equal method content comparision
		HashMap<Long,Integer> map=new HashMap<>();
		Integer p1 = map.put(uid1, 78);
		Integer p2 = map.put(uid2, 76);
		System.out.println("======adhar hash map=====");
		for(Map.Entry<Long, Integer> me:map.entrySet()) {
			System.out.println(me.getKey()+"-----"+me.getValue());
		}
		
		// iddentity hashmap uses equals method intenally
		
		IdentityHashMap<Long,Integer> map1=new IdentityHashMap<>();
		Integer l1 = map1.put(uid1, 99);
		Integer l2 = map1.put(uid2, 23);
		System.out.println("====identity hashmap======");
		for(Map.Entry<Long,Integer> le:map1.entrySet()) {
			System.out.println(le.getKey()+"-----"+le.getValue());
		}
 		
	}

}
