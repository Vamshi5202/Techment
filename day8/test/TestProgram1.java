package com.tech.day8.test;

import java.util.*;

public class TestProgram1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] age = new int[size];
		System.out.println("enter persons ages");
		for (int i = 0; i < size; i++) {
			age[i] = sc.nextInt();
		}
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<size;i++) {
			if(age[i]<18) {
				count1++;
			}
			else if(age[i]>=18&&age[i]<54) {
				count2++;
			}
			else if(age[i]>=55) {
				count3++;
			}
		}
		System.out.println("Children:"+count1);
		System.out.println("Adult:"+count2);
		System.out.println("Senior:"+count3);
	}

}
