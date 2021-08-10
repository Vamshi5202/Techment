package com.tech.exc;
import java.util.*;
public class Excc9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Last Number Uptil You Want Cubes");
		int number = scanner.nextInt();
		for(int i = 1;i<=number;i++)
		{
			System.out.print(Math.pow(i, 3)+" , ");
		}
		scanner.close();
	}

	}


