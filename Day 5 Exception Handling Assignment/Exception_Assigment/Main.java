package com.java.Exception_Assigment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		HandlingException e=new HandlingException();
		e.findQuotient();
		try {
			e.divideByZero();
		} catch (UserdefinedException e1) {
			e1.printStackTrace();
		}
		e.fileException();
		e.multipleCatch();
		e.mergeFiles();
		try {
			e.ageChecking();
		} catch (InvalidAgeException e1) {
			System.out.println(e1.getMessage());
		}
		try {
			e.item();
		} catch (CartEmptyException e1) {
			System.out.println(e1.getMessage());
		}
	}
}


