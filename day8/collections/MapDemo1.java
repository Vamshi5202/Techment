package com.tech.day8.collections;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo1 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "ram", 12);
		Student student2 = new Student(1, "ram", 12);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student(1, "jj", 19), "cse");
		hm.put(new Student(1, "jj", 19), "cse");
		for (Entry<Student, String> stu : hm.entrySet()) {
			System.out.println(stu);
		}
	}

}
