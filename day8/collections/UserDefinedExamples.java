package com.tech.day8.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	String dept;
	int age;

	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.age == o.age) {
			return 0;
		} else if (this.age > o.age) {
			return 1;// -1 for decending
		} else
			return -1;
	}

}

public class UserDefinedExamples {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "murthy", "hr", 31));
		employees.add(new Employee(2, "ramu", "manager", 33));
		employees.add(new Employee(3, "shiva", "hr", 30));
		employees.add(new Employee(4, "giri", "developer", 32));
		Collections.sort(employees);
		System.out.println(employees);
		System.out.println("==========after sort=========");
		for (Employee emp : employees) {
			System.out.println(emp.id + " " + emp.name + " " + emp.dept + " " + emp.age);
		}
	}

}
