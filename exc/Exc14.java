package com.tech.exc;

import java.util.Scanner;

public class Exc14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int []products=new int[size];
		System.out.println("array");
		for(int i=0;i<size;i++) {
			products[i]=sc.nextInt();
		}
		System.out.println("number of the values "+products.length);
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+products[i];
		}
		
    System.out.println("sum of the products "+sum);
	}



}
