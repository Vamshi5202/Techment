package com.tech.exc;
import java.util.*;
public class Excc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter the Age");
			 int Age = scanner.nextInt();
			 scanner.close();
			 if(Age>=18)
				 System.out.println("Welcome To Vote");
			 else
				 throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("InAppropriate Age");
		}
		//scanner.close();
	}
	}


