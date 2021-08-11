package com.tech.day8.test;

class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class TestProgram2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("vamshi", "boddupally");
		Employee emp2 = new Employee("raghu", "kumche");
		Employee emp3 = new Employee("trivikram", "mandela");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());

	}

}
