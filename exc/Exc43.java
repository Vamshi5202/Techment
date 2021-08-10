package com.tech.exc;
import java.util.*;
public class Exc43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		String[]b=a.split(" ");
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

	}

}
