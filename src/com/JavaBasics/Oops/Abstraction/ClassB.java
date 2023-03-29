package com.JavaBasics.Oops.Abstraction;

interface DetailsPrinting{
	 public static final int i=0;
	 abstract void  print();
	 
	 static void code() {
		 System.out.println("Iam Static");
	 }
	 
	 default void Details() {
		 System.out.println("Iam Default");
	 }
	 
}

class NewOrder implements DetailsPrinting{

	@Override
	public void print() {
		System.out.println("In newOrder");
		
	}
	
}

public class ClassB {

	public static void main(String[] args) {
		NewOrder newOrder= new NewOrder();
		newOrder.Details();
		newOrder.print();
		DetailsPrinting.code();
		System.out.println("i value is "+newOrder.i);

	}

}
