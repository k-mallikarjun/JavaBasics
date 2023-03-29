package com.JavaBasics.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExamples {

	public static void main(String[] args) {
		//ArrayLIST
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mallikarjun");
		list.add("Kotupalli");
		list.add("Arjun");
		list.add("Malli");
		
		list.forEach((s)->{
			if(s.equals("Malli"))
			{
				//list.remove("Malli");
			}
			else {
				System.out.println(s);
			}
		
		}
				);
		Iterator irIterator=list.iterator();
		
		//System.out.println("------------------------");
		//System.out.println("------ARRAY LIST -------");
		while(irIterator.hasNext()) {
		//	System.out.println(irIterator.next());
		}
		System.out.println("------------------------");
		
		
		//lINKED LIST
		LinkedList<Integer>score= new LinkedList<Integer>();
		
		score.add(1);
		score.add(2);
		score.add(3);
		score.add(5);

		
		score.addFirst(121);
		score.addLast(122);
		System.out.println("------------------------");
		System.out.println("------Linked LIST -------");
		score.stream().filter(p->p > 3).forEach(n->System.out.println(n));
		System.out.println("------------------------");
	}

}
