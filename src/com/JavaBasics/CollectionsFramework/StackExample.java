package com.JavaBasics.CollectionsFramework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
	    System.out.println("Before :- "+stack);
	    System.out.println("First Element :- "+stack.peek());	
	   stack.pop();
	   System.out.println("After removing First Element :- "+stack);
	   stack.pop();
	   System.out.println("After removing First Element :- "+stack);
		
		

	}

}
