package com.JavaBasics.CollectionsFramework;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Malli");
		v.add("kARUN");
		v.add("rohit");
		v.add("Devil");
		v.add("Babu");
	    System.out.println("Before :-"+v);
	    v.remove(3);
	    System.out.println("After :-"+v);
	    v.add(3, "God");
	    System.out.println("Finally :-"+v);
 
	}

}
