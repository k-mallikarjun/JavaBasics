package com.JavaBasics.CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		  Set<String> hs = new HashSet<String>();
		  hs.add("Mallikarjun");
		  hs.add("Kotupalli");
		  hs.add("Malli");
		  hs.add("Arjun");
		  hs.add("Malli");
		  System.out.println("Set :- "+hs);
		  
		  System.out.println("Does Set Contains \"Mallikarjun\" :- " +hs.contains("Mallikarjun"));
		  
		  hs.remove("Malli");
		  
		  System.out.println("Set :- "+hs);
		   
		  
		  
		  
		  

	}

}
