package com.tech.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}

class AgeSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.age == o2.age) {
			return 0;
		} else if (o1.age > o2.age) {
			return 1;
		} else
			return -1;

	}

}
class NameSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(1, "ahesh", 23));
		stuList.add(new Student(2, "ramesh", 30));
		stuList.add(new Student(3, "suresh", 20));
		for (Student stud : stuList) {
			System.out.println(stud);
		}
		System.out.println("after AgeSort");
		Collections.sort(stuList, new AgeSorting());
		for (Student stud : stuList) {
			System.out.println(stud);
		}
		System.out.println("after NameSort");
       Collections.sort(stuList,new NameSorting());
       for (Student stud : stuList) {
			System.out.println(stud);
	}

}
}