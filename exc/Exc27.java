package com.tech.exc;

import java.util.*;

public class Exc27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int x=random.nextInt();
		int y=random.nextInt();
		if(x%2==0 && y%2==0) {
			System.out.println("sum of random numbers"+(x+y));
		}
		else {
			System.out.println("difference of random numbers"+(x-y));
		}

	}

}
