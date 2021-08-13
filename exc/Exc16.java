package com.tech.exc;

import java.util.*;

public class Exc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		if(number%8==0&&number%3==0) {
			System.out.println("divisible by both numbers");
		}
		else {
			System.out.println("not");
		}
		

	}

}
