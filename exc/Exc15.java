package com.tech.exp;
import java.util.*;
public class Exc15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("array1 size ");
		int size1=sc.nextInt();
		int []array1=new int[size1];
		System.out.println("array1");
		for(int i=0;i<size1;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("array2 size ");
		int size2=sc.nextInt();
		int []array2=new int[size2];
		System.out.println("array2");
		for(int i=0;i<size2;i++) {
			array1[i]=sc.nextInt();
		}
		Object arry1 = null;
		Object[]Array1= {arry1};
		Object[]Array2= {array2};
		if(Arrays.deepEquals(Array1,Array2)){
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays not equal");
		}
	}

}
