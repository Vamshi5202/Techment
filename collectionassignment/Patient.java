package com.tech.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Patient {
	private int patientId;
	private String name;
	private int age;

	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class SortingAge implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		if (o1.getAge() == o2.getAge()) {
			return 0;
		} else if (o1.getAge() > o2.getAge()) {
			return 1;
		} else
			return -1;
	}

}

class SortingName implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {

		return (o1.getName().compareTo(o2.getName()));
	}

}

class TestPatientList {
	public static void main(String[] args) {
		ArrayList<Patient> patientsList = new ArrayList<Patient>();
		patientsList.add(new Patient(1, "vamshi", 45));
		patientsList.add(new Patient(2, "murthy", 55));
		patientsList.add(new Patient(1, "sanju", 25));

		System.out.println("Age Sorting");
		Collections.sort(patientsList, new SortingAge());
		Iterator<Patient> patientitr = patientsList.iterator();
		while (patientitr.hasNext()) {
			System.out.println(patientitr.next());
		}
		/*
		 * for (Patient patient : patientsList) { System.out.println(patient); }
		 */
		System.out.println("Name sorting");
		Collections.sort(patientsList, new SortingName());

		for (Patient patient : patientsList) {
			System.out.println(patient);
		}
		TreeSet<Patient> patientset = new TreeSet<Patient>(patientsList);
		System.out.println("Sorting using TreeSet" + patientset);

	}

}