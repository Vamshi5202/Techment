package com.tech.oopassignment;

import java.util.Random;
import java.util.Scanner;

abstract class Medicine {
	int price;
	String expiryDate;

	public void getDetails() {
		System.out.println("price" + price);
		System.out.println("ExpiryDate:" + expiryDate);
	}

	abstract void displayLabel();

}

class Tablet extends Medicine {

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("store in dry places");
	}

}

class Syrup extends Medicine {

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("daily one spoon");
	}
}

class Ointment extends Medicine {

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("for external use only");
	}

}

public class Assignment5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Medicine[] medicine = new Medicine[5];
		for (int i = 0; i < medicine.length; i++) {
			System.out.println("price");
			int price = sc.nextInt();
			System.out.println("expiray date");
			String expiryDate = sc.next();
			medicine[i] = new Medicine(price, expiryDate);
		}

		Medicine tablet = new Tablet();
		Medicine syrup = new Syrup();
		Medicine oitment = new Ointment();
		Random random = new Random();
		int n = random.nextInt(3);
		if (n == 1) {
			tablet.displayLabel();
			tablet.getDetails();
		} else if (n == 2) {
			syrup.displayLabel();
		} else if (n == 3) {
			oitment.displayLabel();
		}

	}

}
