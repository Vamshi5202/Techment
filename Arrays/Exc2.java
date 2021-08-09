package com.tech.Arrays;
import java.util.*;
public class Exc2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int[]array=new int[size];
		System.out.println("array");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter the number to serach");
		int n=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(array[i]==n) {
				System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
		}
		

	}

}
