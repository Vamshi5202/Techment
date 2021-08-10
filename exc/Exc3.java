package com.tech.exc;
import java.util.*;
public class Exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("horse 1");
		int h1=sc.nextInt();
		System.out.println("horse 2");
		int h2=sc.nextInt();
		System.out.println("horse 3");
		int h3=sc.nextInt();
		if(h1==h2||h2==h3||h1==h3) {
			System.out.println("entered weights are not distinct");
		}
		else if(h1>h2&&h1>h3) {
			System.out.println("max weight horse"+h1);
		}
		else if(h2>h1&&h2>h3) {
			System.out.println("max weight horse"+h2);
		}
		else  {
			System.out.println("max weight horse"+h3);
		}





	}

}
