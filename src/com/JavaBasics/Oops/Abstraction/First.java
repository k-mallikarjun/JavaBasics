package com.JavaBasics.Oops.Abstraction;

import java.io.IOException;

class First implements Runnable
{
Thread t; String S;
First(String Name){
S=Name;
t = new Thread(this,S);
System.out.println("CHILD :" + t);
t.start();
}
public void run( )
{
try{ for(int i = 5; i>0; i--) 
{
System.out.println(S + " :" + i);
Thread.sleep(1000); }
} //END OF TRY BLOCK
catch(InterruptedException e){ }
System.out.println("EXITING " + S);
} 
}
class Second
{
public static void main(String [ ]args) throws IOException
{
new First("ONE");
new First("TWO");
new First("THREE");
try{
Thread.sleep(20000);
} //END OFTRY BLOCK
catch(InterruptedException e){ }
System.out.println("EXITING MAIN");}}
