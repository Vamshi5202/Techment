package com.tech.exc;
import java.util.*;
public class Exc26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		Random random=new Random();
		int number=random.nextInt(10);
		if(number==n) {
			System.out.println("numbers are same");
		}
		else {
			System.out.println("numbers not same");
		}
		

	}

}
