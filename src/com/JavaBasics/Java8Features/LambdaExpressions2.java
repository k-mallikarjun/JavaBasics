package com.JavaBasics.Java8Features;
interface display {
	
	// FunctionalInterface one abstract method
     public abstract String print(String message);
     
}

	public class LambdaExpressions2 {

	public static void main(String[] args) {
		display d=(message)->{
			return "Hello  " + message;
		};
		System.out.println(d.print("Malli"));

	}

}
