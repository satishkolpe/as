package com.satish.collectionsapps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp3 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 45, 6, 7, 5, 43, 4, 5, 6);

		List<Integer> collect1 = asList.stream().filter(ele -> ele % 2 != 0).collect(Collectors.toList());
		System.out.println(collect1);
		List<Integer> collect2 = collect1.stream().map(ele -> ele * ele * ele).collect(Collectors.toList());
		System.out.println(collect2);

		long ll = collect2.stream().reduce((element1, element2) -> (element1 + element2)).get().longValue();
		System.out.println(ll);
		List<Integer> collect4 = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect4);
		
		
	}

}
