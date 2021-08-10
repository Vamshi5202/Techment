package com.tech.exc;

import java.util.*;

public class Exc49 {
	public static void main(String[] args) {

		System.out.println("Enter your dob :");
		Scanner scanner = new Scanner(System.in);
		String dob = scanner.next();
		int dobDate = Integer.parseInt(dob.substring(0, 4));
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("Your age is " + (year - dobDate) + " years");

	}

}
