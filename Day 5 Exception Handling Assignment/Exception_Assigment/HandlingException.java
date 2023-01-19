package com.java.Exception_Assigment;

import java.io.*;
import java.util.ArrayList;

public class HandlingException {
	public void findQuotient()
	  {
		  int num1=50;
		  int num2=0;
		  try
		  {
			  int divide=num1%num2;
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Cannot find Quotient");
		  }
	  }
	public void divideByZero() throws UserdefinedException
	{
		int num1=10;
		int num2=0;
		try
		{
			if(num2==0)
			{
				throw new UserdefinedException("Denominator cannot be zero");
			}
		}
		catch(UserdefinedException e)
		{
			System.out.println("Denominator zero - Handled");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	public void fileException() throws FileNotFoundException, IOException
	{
		
	   	try
	   	{
	   		File fl=new File("lopa.txt");
	   		FileReader f=new FileReader(fl);
	   		BufferedReader b=new BufferedReader(f);
	   		String file=null;
	   		
	   		try
	   		{
	   			if((file=b.readLine())==null)
	   			{
	   				throw new IOException();
	   			}
	   			else
	   			{
	   				System.out.println(file);
	   			}
	   		}
	   		catch(IOException i)
	   		{
	   			System.out.println("IOException");
	   		}
	   	}
	   	catch(FileNotFoundException n)
	   	{
	   		System.out.println("File Exception - FileNotFoundException");
	   	}
	   	
	}
	public void multipleCatch()
	{
		int num1=20;
		int num2=0;
		try
		{
			int d=num1/num2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Multiple catch - ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException l)
		{
			System.out.println("Multiple catch - ArrayIndexOutOfBoundException");
		}
		finally
		{
			System.out.println("Exception handled");
		}
	}
	public void mergeFiles() throws IOException, FileNotFoundException
	{
		try {
		PrintWriter pw = new PrintWriter("file3.txt"); 
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt")); 

          int c=0;
          int p=0;
        try 
       {
        	while(((c=br1.read())!=-1) || ((p=br2.read())!=-1))
          {
             if((c=br1.read())!=-1) 
            {             
                pw.println((char)c);
                c=br1.read();
            } 
             if ((p=br2.read())!=-1) 
             { 
            	 pw.println((char)p);
            	 p=br2.read();
             }
          }
             pw.flush();
             br1.close();
             br2.close();
             pw.close();
        System.out.println("Done successfully!");
       }
        catch(IOException e)
        {
        	System.out.println("IOException Handled");
        }
		}
		catch(FileNotFoundException f)
		{
			System.out.print("FileNotFoundException Handled - Merge two files alterantively");
		}
	}
	public void ageChecking() throws InvalidAgeException
	{
		int age=14;
	   
	    	if(age<18)
	    	{
	    		throw new InvalidAgeException("Invalid Age");
	    	}
	}
	public void item() throws CartEmptyException
	{
		ArrayList<Item> a=new ArrayList<>();
		a.add(new Item(1,"Lopa",50));
		a.add(new Item(2,"Mukesh",80));
		a.add(new Item(3,"Joshita",10));
		a.add(new Item(4,"Kiruthick",90));
		a.add(new Item(5,"Viswanath",20));
		a.add(new Item(6,"Chaitanya",60));
		
		if(a.size()==0)
		{
			throw new CartEmptyException("Your cart is empty");
		}
		else
		{
			System.out.println("You cart has itams which can be purcahsed");
		}
		
	}
}
