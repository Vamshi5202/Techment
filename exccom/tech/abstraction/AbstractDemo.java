package com.tech.exccom.tech.abstraction;

abstract class Bank {
	void eligibility() {
		System.out.println("above 18");
	}

	abstract int rate(int interest);
}

class Axis extends Bank {

	@Override
	int rate(int interest) {
		// TODO Auto-generated method stub
		interest = 2 * interest;
		return interest;
	}

}

class Kotak extends Bank {

	@Override
	int rate(int interest) {
		// TODO Auto-generated method stub
		System.out.println("rate of interest" + interest);
		return interest;
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Kotak();

		// Bank bank=new Axis();
		System.out.println(bank.rate(2));

	}

}
