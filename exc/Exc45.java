package com.tech.exc;

import java.util.Scanner;

public class Exc45 {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		int correctpin=12345;
		System.out.println("enter pin");
		int pin=sc.nextInt();
		while(correctpin!=pin) {
			if(count==2) {
				System.out.println("account blocked");
				break;
			}

			System.out.println("enter correct pin");
			count++;
						pin=sc.nextInt();
			if(pin==correctpin) {
				System.out.println("pin accepted");
			}
		}


	}

}
