package com.tech.collection;

import java.util.ArrayList;

class Employee {
	private int id;
	private String name;
	private String dept;

	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}

public class UserDefineType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, "murthy", "hr");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(new Employee(2, "raghu", "manager"));
		/*
		 * for(Employee emp:employees) {
		 * System.out.println(emp.id+""+emp.name+""+emp.dept); } employees.set(1, new
		 * Employee(100,"mawa","ceo")); for(Employee emp:employees) {
		 * System.out.println(emp.id+""+emp.name+""+emp.dept); }
		 */
		for (Employee emp : employees) {
			if (emp.getId() == 1) {
				emp.setDept("asst");
				System.out.println(emp.getId() + " " + emp.getDept() + " " + emp.getName());
			}
		}

	}

}
