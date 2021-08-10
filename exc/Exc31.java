package com.tech.exc;

import java.util.*;

public class Exc31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		for (int i = 1; i <= b; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}

}
