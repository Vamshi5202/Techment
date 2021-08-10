package com.tech.exc;
import java.util.*;
public class Excc18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the First Number");
		 int numerator = scanner.nextInt();
		 System.out.println("Enter the Second Number");
		 int denominator = scanner.nextInt();
		 try {
		 if(denominator==0)
		 {
			 throw new ArithmeticException();
		 }
		 }
		 catch(ArithmeticException ex)
		 {
			 System.out.println("ArithmeticException");
		 }
		 finally {
			System.out.println("Inside Finally Block");
		}
		 scanner.close();
	}

	}


