package com.JavaBasics.Oops.Inheritance;


class Multi{
	public void Mprint() {
		System.out.println("Multi");
	}
}
class MultiL extends Multi{
	public void MLprint() {
		System.out.println("Level");
	}
}
class MultilevelInheritance extends MultiL{
	public void MLIprint() {
		System.out.println("Inheritance");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		
		MultilevelInheritance inheritance= new MultilevelInheritance();
		inheritance.Mprint();
		inheritance.MLprint();
		inheritance.MLIprint();
	}

}
