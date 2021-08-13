package com.tech.exc;
import java.util.*;
public class Exc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try {
			Validate(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void Validate(int age)throws InvalidAgeException {
		
		if(age<18) {
			throw new InvalidAgeException("not eligible to vote");
		}
		else {
			System.out.println("eligible to vote");
		}

	}

}
class InvalidAgeException extends Exception{
	String msg;

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}
