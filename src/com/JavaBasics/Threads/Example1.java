package com.JavaBasics.Threads;

public class Example1 extends Thread{
	public void run() {
		System.out.println("Hello iam "+this.getName());
		System.out.println("Hello iam "+this.getPriority());
	}
}
