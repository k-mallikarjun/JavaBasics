package com.JavaBasics.Oops.Polymorphism;


//run time or dynamic 
class parent{
	public void print() {
		System.out.println("Iam Parent");
	}
}
class child1 extends parent{
	public void print(){
		System.out.println("Iam Child1");
	}
}
class child2 extends parent{
	public void print(){
		System.out.println("Iam Child2");
	}
}
public class RunTime {
	public static void main(String[] args) {
		parent p;
		p= new child1();
		p.print();
		
		p=new child2();
		p.print();
		
	}
}
