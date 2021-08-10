package com.tech.exc;
import java.util.*;
public class Exc13 {

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
		int max=products[0];
		for(int i=0;i<size;i++) {
			if(products[i]>max) {
				max=products[i];
			}
		}
		
    System.out.println("maximum quantity product "+max);
	}

}
