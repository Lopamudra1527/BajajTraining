package com.java.exception;

public class Main {
   public static void main(String[] args)
   {
	   ExceptionHandling e=new ExceptionHandling();
	   e.divide();
	   e.nullPointer();
	   try
	   {
		   e.method();
	   }
	   catch(Exception p)
	   {
		   System.out.println("exception handled");
	   }
	   try
	   {
		   e.validateAge();
	   }
	   catch(CustomException d)
	   {
		   System.out.print("Custom Exception Handled");
	   }
	   e.nested_try();
   }
}
