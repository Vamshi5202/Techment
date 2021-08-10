package com.tech.exc;
import java.util.*;
public class Exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("year");
		int year=sc.nextInt();
				if((year%4==0)&&(year%100!=0)||(year%400==0)){
					System.out.println("leap year");
				}
				else {
					System.out.println("not leap year");
				}

	}

}
