package com.java.java8;

public class InterfaceTest implements Test{

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}
	public int add(int num1,int num2)
	{
		System.out.print(num1+num2);
		return num1+num2;
	}
}
