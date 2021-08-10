package com.tech.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("name is vamshi");
		int arr[] = new int[5];
		try {
			System.out.println(1 / 0);
			arr[4] = 20;
			System.out.println(8/2);

		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("array size is 5");
		}
		catch (ArithmeticException e) {
			System.out.println("don't give zero");

		}
		System.out.println("welcome");

	}

}
