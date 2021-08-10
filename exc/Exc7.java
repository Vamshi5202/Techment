package com.tech.exc;
import java.util.*;
public class Exc7 {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	int number1 = scanner.nextInt();
	System.out.println("Enter the second number");
	int number2 = scanner.nextInt();
	if(number1>0 && number2>number1)
	{
		for(int i = number1;i<=number2;i++)
		{
			System.out.println("Number " + i + "  Solder Can Go");
		}
	}
	else
		System.out.println("Please Enter the valid numbers");
	scanner.close();
}
}
