package com.satish.collectionsapps;

public class Generics1<E> {

	void swappingOfInt(E a, E b) {
		E t = a;
		a = b;
		b = t;
		show(a, b);
	}

	void show(E a, E b) {
		System.out.println("a=" + a + ",b=" + b);
	}

	public static void main(String[] args) {
		Generics1<Integer> ob1 = new Generics1<>();
		ob1.swappingOfInt(1, 99);

	}

}
