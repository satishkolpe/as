package com.satish.collectionsapps;

public class WrapperClass01 {

	public static void main(String[] args) {
		// BOXING:converting value type to reference type

		int x = 22;
		Integer object = new Integer(x);
		System.out.println(object);

		// UN-BOXING:converting refernce type to value type

		Double doubleObject = new Double(50.0);
		double doubleValue = doubleObject.doubleValue();
		System.out.println(doubleValue);
		// ========converting string to primitive/wrapper.

		String str = "200";
		int parseInt = Integer.parseInt(str);
		Integer valueOf = Integer.valueOf(str);

		// ========converting primitive/wrapper to string

		int c = 12;
		Integer int2 = new Integer(23);
		String str1 = String.valueOf(c);
		System.out.println(str1);

		String str2 = Integer.toString(int2);
		System.out.println(str2);

	}

}
 