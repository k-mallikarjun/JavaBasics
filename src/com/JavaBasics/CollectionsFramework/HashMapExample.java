package com.JavaBasics.CollectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String>hMap=new HashMap<Integer,String>();
		
		
		hMap.put(11, "A");
		hMap.put(12,"B");
		hMap.put(13,"C");
		hMap.put(14,"D");
		System.out.println(hMap);
		
		Set<Integer>keysIntegers=hMap.keySet();
		
		System.out.println("Keys are " + keysIntegers);
		
		Collection<String>vaStrings= hMap.values();
		
		System.out.println("Values  are " + vaStrings);

	}

}
