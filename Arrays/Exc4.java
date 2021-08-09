package com.tech.Arrays;

import java.util.*;

public class Exc4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size1");
		int size1=sc.nextInt();
		int[]array1=new int[size1];
	
		
		System.out.println("size2");
		int size2=sc.nextInt();
		int[]array2=new int[size2];
		
		int [] array3=new int[size1+size2];
		System.out.println("array1");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("array2");
		for(int i=0;i<array2.length;i++) {
			array2[i]=sc.nextInt();
		}
		for(int i=0;i<array1.length;i++) {
			array3[i]=array1[i];
		}
		for(int i=0;i<array2.length;i++) {
			array3[array1.length+i]=array2[i];
		}
		for(int i=0;i<array3.length;i++) {
			System.out.println(array3[i]);
		}
		
		

	}

}
