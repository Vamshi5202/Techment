package com.tech.exc;

public class Exc36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
			if(j<i)System.out.print(j);
			else System.out.print(" ");
			}
			for(int j=5;j>=1;j--) {
				if(j<=i)System.out.print(j);
				else System.out.print("");
			}
			System.out.println();

	}

}
	}

