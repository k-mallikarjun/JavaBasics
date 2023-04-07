package com.JavaBasics.StreamApi;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

interface arkol extends Callable<Object>, Runnable{
	
}
public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<>();
		Random rdmRandom= new Random();
	while(arrayList.size()!=10)
	{
		arrayList.add(rdmRandom.nextInt(100));
	}
	arrayList.forEach(System.out::println);
	System.out.println("multiples of 2");
	
	Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);
	System.out.println("Use of filter on arraylist ");
	arrayList.stream().filter(i-> i<50).forEach(System.out::println);
	
	}

}
