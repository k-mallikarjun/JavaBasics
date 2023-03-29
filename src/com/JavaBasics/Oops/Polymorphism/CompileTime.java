package com.JavaBasics.Oops.Polymorphism;

//compile time or static 
class Add{
	public int add(int a , int b)
	{
		System.out.println("In Adding of Integers Method");
		return a+b;
	}
	public float add(float a , float b)
	{
		System.out.println("In Adding of Float Method");
		return a+b;
	}
}
public class CompileTime {

	public static void main(String[] args) {
	
		
	 Add ad=new Add();
	System.out.println("Addition of 2 and 3   is "+ad.add(2, 3));
	System.out.println("Addition of 2.6 and 3.1 is  "+ad.add(2.6f, 3.1f));

	}

}
