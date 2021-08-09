package com.tech.Arrays;
import java.util.*;
public class Exc3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int[]array=new int[size];
		System.out.println("array");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int temp=array[0];
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		
		System.out.println(array[i]);
		
		}
	}

}
