package com.JavaBasics.Oops.Inheritance;

class ClassA {

	public void Aprint() {
		System.out.println("In ClassA");
	}
	
}
 class ClassB extends ClassA{

	public void Bprint() {
		System.out.println("In ClassB");
	}
	
}
 
 public class Main {
	 public static void main(String[] args)
	 {
		 ClassB b=new ClassB();
		 b.Aprint();
		 b.Bprint();
	 }
 }

