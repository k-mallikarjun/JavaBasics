package com.JavaBasics.Oops.Inheritance;

interface one{
	public abstract void Print();
}
interface two {
	public abstract void display();
	
}

interface three extends one,two{
	public abstract void Print();
}
class Child implements three{

	
	public void Print() {
		
		System.out.println("Iam print");
	}
	
	public void display() {
		System.out.println("Iam Display");
	}
	
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Child child= new Child();
		child.display();
		child.Print();
	}

}
