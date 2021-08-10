package com.tech.exc;

import java.util.*;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int n = sc.nextInt();
	
		if (n < 10 || n > 99) {
			System.out.println("no exit");
		} else {

			int first = n / 10;
			int last = n % 10;
			int sum = first + last;
			int pro = first * last;
			if ((sum + pro) == n) {
				System.out.println("exit door");
			} else {
				System.out.println("no exit");
			}

		}
	}
}
