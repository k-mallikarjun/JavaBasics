package com.JavaBasics.CollectionsFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String>tMap=new TreeMap<Integer, String>();
		tMap.put(1, "One");
		tMap.put(2, "tWO");
		tMap.put(3, "three");
		tMap.put(4, "four");
		tMap.put(5, "Five");

		 for(Map.Entry m:tMap.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	}

}
