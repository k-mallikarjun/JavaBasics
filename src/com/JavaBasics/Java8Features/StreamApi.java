package com.JavaBasics.Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Bike{
	String company;
	 String model;
	  int cc;
	  int noOfGears;
	  long Cost;
	  
	  public  Bike(String company,String model, int cc,int noOfGears, long Cost) {
		  this.company=company;
		  this.model=model;
		  this.cc=cc;
		  this.noOfGears=noOfGears;
		  this.Cost=Cost;
	  }
}
public class StreamApi {

	public static void main(String[] args) {
	  
		ArrayList<Bike> aList=new ArrayList<Bike>();
		
		aList.add(new Bike("Royal Enfield","Classic",350,5,350000L));
		aList.add(new Bike("HONDA","Shine",125,4,50000L));
		aList.add(new Bike("YAMAHA","R15",300,5,250000L));
		aList.add(new Bike("HONDA","Activa 6g",125,0,90000L));
		aList.add(new Bike("Royal Enfield","Himayala",550,5,450000L));
		
		List<String> aList2=aList.stream()
				.filter(c -> c.Cost <= 250000L)
				.map(Name -> Name.company)
				.collect(Collectors.toList());
		
		System.out.println(aList2);
	}

}
