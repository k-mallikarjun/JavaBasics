package com.JavaBasics.Java8Features;

import java.util.ArrayList;

public class LambdaExpressions {

	public static void main(String[] args) {
		ArrayList<Integer>aList=new ArrayList<Integer>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
	
		aList.forEach(
				(n)->{
					System.out.println(n);
				}
				);
		

	}

}
