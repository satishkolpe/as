package com.satish.collectionsapps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx1 {
     int x=23;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// approach 1:by list interface

		List ob1 = new ArrayList();
		ob1.add(10);
		ob1.add(12.9F);
		ob1.add(13l);
		ob1.add(45D);
		ob1.add("satish");
		System.out.println(ob1);
//	approach2:by implemented class
		ArrayList ob2 = new ArrayList();
		ob2.add(10D);
		ob2.add(19L);
		ob2.add(13F);
		ob2.add(23);
		ob2.add("amar");
		System.out.println(ob2);

//		approach 3: by generics
		ArrayList<Integer> ob3 = new ArrayList<>();
		ArrayList<Integer> ob4 = new ArrayList<>();
		ArrayList<Integer> ob5 = new ArrayList<>();
		ob3.add(33);
		ob3.add(44);
		ob3.add(111);
		ob4.add(222);
		ob4.add(323);
		ob4.add(444);
		ob5.add(909);
		ob5.add(555);
		ob5.add(777);
		ob3.addAll(ob4);
		ob3.addAll(ob5);
		ob4.remove(1);
		System.out.println(ob3.contains(33));
		System.out.println(ob4.contains(909));
		System.out.println("=========");
		// iterating by for each
		for (Integer integer : ob4) {
			System.out.println(integer);
		}
		Iterator<Integer> iterator1 = ob4.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());

		}
		System.out.println("========list iterator in forword=====");
		ListIterator<Integer> listIterator2 = ob5.listIterator();
		while (listIterator2.hasNext()) {
			System.out.println(listIterator2.next());
		}
		System.out.println("======list iterator in backword direction==");
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
		System.out.println("===iterating by for each method==");
		ob5.forEach((integer) -> {
			System.out.println(integer);
		});
		ob5.forEach(System.out::println);
		ArrayList<Flight> flights = new ArrayList<>();
		flights.add(new Flight(101, "satishex", "pune", "mumbai"));
		flights.add(new Flight(102, "patilex", "aundha", "sikandarbad"));
		flights.add(new Flight(103, "rajeex", "lahore", "chennai"));
		flights.add(new Flight(104, "haoeraex", "akola", "sengaon"));
		for (Flight flight : flights) {
			System.out.println(flight);
		}
		List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50);

		List<Flight> flightsList = Arrays.asList(new Flight(101, "satishex", "pune", "mumbai"));

	}

}
