package com.satish.collectionsapps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		String str = "hare krishna hare krishna HARE hare rama rama";
		String[] strings = str.split("");
		List<String> asList = Arrays.asList(strings);
		Map<String, Long> result = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}

}
