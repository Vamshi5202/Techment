package com.tech.exc;
import java.util.*;
public class Exc6 {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);  
	System.out.println("Enter the FirstNumber");
	int firstnumber = scanner.nextInt();
	System.out.println("Enter the Operator");
	char operator = scanner.next().charAt(0);
	System.out.println("Enter the SecondNumber");
	int secondnumber = scanner.nextInt();
	//here it is not able to check which statement to run let me run and show you
	
	
	
	switch(operator)
	{
	case '+' :
	{
		System.out.println("The SUm Of The Numbers Is " + (firstnumber + secondnumber));
		break;
	}

	case '-' :
	{
		System.out.println("The Difference  Of The Numbers Is " + (firstnumber - secondnumber));
		break;
	}

	case '*' :
	{
		System.out.println("The Multiplication  Of The Numbers Is " + (firstnumber * secondnumber));
		break;
	}
		

	case '/' :
	{
		System.out.println("The Division Of The Numbers Is " + (firstnumber / secondnumber));
		break;
	
	}
	
	}
	
}
}