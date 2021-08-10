package com.tech.exc;

import java.util.Scanner;

public class Exc37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number");
		int n=sc.nextInt();
		int count=1;
		int space=1;
		int start=0;
		for(int i=1;i<(n*2);i++) {
			for(int j=n-space;j>0;j--) {
				System.out.print(" ");
			}
			if(i<n) {
				start=i;
				space++;
			}
			else {
				start=n*2-i;
				space--;
			}
			for(int j=0;j<count;j++) {
				System.out.print(start);
				if(j<count/2) {
					start--;
					
				}
				else {
					start++;
				}
			}
			if(i<n) {
				count=count+2;
			}
			else {
				count=count-2;
			}
			System.out.println();
		}

	}

}
