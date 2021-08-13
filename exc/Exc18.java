package com.tech.exc;
import java.util.*;
public class Exc18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		int c=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {}
		System.out.println("completed");
	}

}
