package com.tech.exceptionassignment;

import java.util.InputMismatchException;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			int div = number1 / number2;
			System.out.println("Division " + div);
		} catch (ArithmeticException e) {
			System.out.println("division with zero is not possible");
		} catch (NumberFormatException e) {
			System.out.println("Only integers are allowed");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No input Received");
		}
	}

}
