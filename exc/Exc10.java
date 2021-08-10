package com.tech.exc;
import java.util.*;
public class Exc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Last Number Uptil You Want Primes");
		int number = scanner.nextInt();
		for(int i =2;i<number;i++)
		{
			int count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
		
		scanner.close();
			
	}

	}


