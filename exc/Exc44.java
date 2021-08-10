package com.tech.exc;
import java.util.*;
public class Exc44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a");
		int a=sc.nextInt();
		System.out.println("b");
		int b=sc.nextInt();
		System.out.println("c");
		int c=sc.nextInt();
		
		int s=(a+b+c)/2;
		int A=(int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(A);



	}

}
