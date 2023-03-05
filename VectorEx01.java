package com.satish.collectionsapps;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		System.out.println(v1.capacity());
		System.out.println(v1.size());

		Vector v2 = new Vector(100);
		System.out.println(v2.capacity());
		System.out.println(v2.size());

		Vector<Integer> v3 = new Vector<>(5);
		System.out.println(v3.capacity());
		System.out.println(v3.size());

		for (int i = 0; i <= 10; i++) {
			v3.add(i);
		}
		System.out.println(v3.capacity());
		System.out.println(v3.size());

		Vector<Integer> v4 = new Vector<>();
		v4.add(12);
		v4.add(13);
		v4.add(67);
		v4.addElement(133);
		v4.remove(2);
		for (Integer xyz : v4) {
			System.out.println(xyz);
		}

	}

}
