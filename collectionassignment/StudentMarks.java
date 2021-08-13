package com.tech.collectionassignment;

import java.util.*;

public class StudentMarks {

	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>marks=new ArrayList<Integer>();
		System.out.println("Number Of Students");
		int n = sc.nextInt();
		System.out.println("Enter Marks");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			marks.add(a);
		}
		System.out.println("Highest Marks"+Collections.max(marks));
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+marks.get(i);
		}
		System.out.println("Average marks:"+sum/n);
		System.out.println("3rd Student:"+marks.get(2));
		Collections.sort(marks);
		Iterator<Integer> it=marks.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

