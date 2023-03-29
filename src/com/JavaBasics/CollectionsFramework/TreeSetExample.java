package com.JavaBasics.CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<String> ts = new TreeSet<String>();
		  ts.add("B");
		  ts.add("D");
		  ts.add("A");
		  ts.add("C");
		  
		  ts.add("A");
		  
		  System.out.println("Tree Set :- "+ ts);
		  
		  ts.remove("C");
		  System.out.println("Tree Set after Removing \"C\" :- "+ ts);
	}

}
