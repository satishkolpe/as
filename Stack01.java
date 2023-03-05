package com.satish.collectionsapps;

import java.util.Stack;

public class Stack01 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		// push,pop,peek,search,
		stack.push(10);//0 4
		stack.push(20);//1 3
		stack.push(30);//2 2
		stack.push(40);//3 1
		System.out.println(stack.peek());//return the top most element
		System.out.println(stack);
		for(Integer element:stack) {
			System.out.println(element);
		}
		System.out.println(stack.search(10));//2
	}

}
