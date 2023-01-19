package com.java.exception;
import java.io.*;

public class ExceptionHandling {
  public void divide()
  {
	  int num1=50;
	  int num2=0;
	  try
	  {
		  int divide=num1/num2;
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Cannot be divided");
	  }
  }
  public void nullPointer()
  {
	  String p=null;
	  try
	  {
		  int n=p.length();
		  
	  }
	  catch(NullPointerException e)
	  {
		  System.out.println("Null Pointer Exception");
	  }
  }
  void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
  public void validateAge() throws CustomException
  {
	  if(19<18)
	  {
		  throw new CustomException("Age is not valid");
	  }
	  else
	  {
		  System.out.println("Ok, Proceed");
		  
	  }
  }
  public void nested_try()
  {
	  int num1=5;
	  int num2=0;
	  try
	  {
		  try
		  {
		    int d=num1/num2;
		  }
		  catch(ArithmeticException s)
		  {
			  System.out.println("Cannot be divided - nested try");
		  }
		  try
		  {    
			  int a[]=new int[5];  
			  a[5]=4;  
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  { 
			  System.out.println("ArrayIndex out of bound exception"); 
		  }  
	  }
	  catch(Exception j)
	  {
		  System.out.print("OuterCatch Block");
	  }
	  finally
	  {
		  System.out.println("Final code");
	  }
  }
}
