package com.tech.exc;

import java.util.Scanner;

public class Exc42 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("string");
		String a=sc.next();
		
		perm(a,"");
		
	}
	public static void perm(String b,String c) {
		if(b.length()==0) {
			System.out.println(c);
			return;
		}
		for(int i=0;i<b.length();i++) {
			char ch=b.charAt(i);
			String left=b.substring(0,i);
			String right=b.substring(i+1);
			String total=left+right;
			perm(total,ch+c);
		}
		
	}

}
