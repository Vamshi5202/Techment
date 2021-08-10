package com.tech.exc;

public class Exc12 {
	public static void main(String[] args) {
		int num = 5;
		int z=5;

		for (int i = 1; i <= num; i++) {
			for(int j=1;j<=num-i;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(z);
			}
		

		}
	}
}
