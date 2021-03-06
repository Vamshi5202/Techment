package com.tech.day8.test;

class Employee1 {
	private String firstName;
	private String lastName;

	public Employee1(String firstName, String last) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void Validation() throws NameException {

		if (this.firstName.length() < 3 && this.lastName.length() < 3) {
			throw new NameException("Name should be minimum 3 characters");
		}

		else if (this.firstName == null && this.lastName == null) {
			throw new NullPointerException("Entry missing");
		}

	}

}

class NameException extends Exception {
	String msg;

	public NameException(String msg) {
		super();
		this.msg = msg;
	}

}

public class TestProgram3 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1("q", "m");
		try {
			emp.Validation();
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
