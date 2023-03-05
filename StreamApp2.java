package com.satish.collectionsapps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp2 {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(2, -43, 455, -67, 8, -9, 12);
//		List<Integer> c1 = lst.stream().map(ele -> ele + 2).collect(Collectors.toList());
////		System.out.println(c1);
////		c1.forEach(x->System.out.println(x));
//		c1.forEach(System.out::println);
//		List<Integer> c2 = lst.stream().map(ele -> ele*ele).collect(Collectors.toList());
//		System.out.println(c2);
		List<Integer> c3 = lst.stream().map(ele -> -ele).collect(Collectors.toList());
		System.out.println(c3);
	}

}
