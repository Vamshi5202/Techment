package com.tech.exc;

import java.util.Scanner;

public class Exc52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("AB");
		int AB = sc.nextInt();
		System.out.println("BC");
		int BC = sc.nextInt();
		System.out.println("AC");
		int AC = sc.nextInt();
		if (AB + BC > AC || AB + AC > BC || AC + BC > AB) {
			System.out.println("right angle triangle");
		}

		else {
			System.out.println("not a right angle triangle");
		}

	}

}
