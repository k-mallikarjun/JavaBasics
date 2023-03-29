package com.JavaBasics.ExceptionHandling;

class NotAllowedException extends Exception{
	public NotAllowedException(String str)
	{
		super(str);
	}
}


public class Example2 {
   static boolean check(String role) throws NotAllowedException
  {
	 if(role.equalsIgnoreCase("Admin")) {
		 return true;
	 }
	 else {
		 throw new NotAllowedException("You are not a valid User");
	 }
  }
	public static void main(String[] args) {
		
	 try {
		
		
		boolean b=check("Admin");
	} 
	 catch (NotAllowedException e) {
		 System.out.println("Caught the exception"); 
	  System.out.println(e.getMessage());
	}

	}
	
	

}
