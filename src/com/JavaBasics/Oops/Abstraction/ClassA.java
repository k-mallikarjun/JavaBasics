package com.JavaBasics.Oops.Abstraction;

abstract class vechile {
	
      String vechileName;
	  
	   public vechile(String vechileName) {
		System.out.println("Vechile Information Constructor:-");
		this.vechileName=vechileName;
	   }
	
	   
	 public abstract String model();
	 public abstract long price();
	 public final int year() {
		 return 2022;
	 }
	 
	 public String getName() {
		 return vechileName;
	 }
	
}


class Bmw extends vechile{

	String country;
	
	public Bmw(String vechileName , String country) {
		super(vechileName);
		System.out.println("BMW information Constructor:-");
		this.country=country;
	}

	@Override
	public String model() {
		
		return "A-3";
		
		
	}

	@Override
	public long price() {
		return 1236984536;
		
		
	}
       
	public String toString() {
		
		return "CarName:-"+ super.getName() +", Country:- "+country +" , Model :-  " +model() + " , Price :- " +price();
	}
	
}



public class ClassA {

	public static void main(String[] args) {
		vechile carBmw= new Bmw("BMW", "India");
		System.out.println(carBmw.toString());
	}

}
