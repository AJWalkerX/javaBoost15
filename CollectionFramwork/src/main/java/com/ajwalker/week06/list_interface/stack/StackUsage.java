package com.ajwalker.week06.list_interface.stack;

import java.util.Stack;

public class StackUsage {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(20);
		stack.push(5);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println("--- pop ---");
		Integer pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack);
		
//		stack.clear();
		boolean isEmpty = stack.empty();
		System.out.println(isEmpty);
		
	}
}