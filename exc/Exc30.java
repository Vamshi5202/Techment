package com.tech.exc;

import java.util.*;

public class Exc30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String a = sc.next();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				count++;

			}
		}
		System.out.println(count);
		System.out.println("first character" + a.charAt(0));
		System.out.println("last character" + a.charAt(a.length() - 1));
		int count1=0;
		for (int i = 0; i < a.length(); i++) {
             if(a.charAt(i)=='a') {
            	 count1++;
             }
		}
		System.out.println(count1);

	}

}
