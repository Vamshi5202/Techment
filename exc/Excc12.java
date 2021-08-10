package com.tech.exc;
import java.util.*;
public class Excc12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number");
		int rows=sc.nextInt();
		int k=0,count=0,count1=0;
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=rows-i;space++) {
				System.out.print(" ");
				count++;
			}
			while(k!=2*i-1) {
				if(count<=rows-1) {
					System.out.print((rows-i + k+1)+" ");
					count++;
				}
				else {
					count1++;
					System.out.print((rows-i+k-2*count1+1)+" ");
				}
				k++;
			}
			count1=count=k=0;
			System.out.println();
		}
	}

}
