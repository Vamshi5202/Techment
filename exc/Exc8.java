package com.tech.exc;
import java.util.*;
public class Exc8 {
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the 3 Digit Number");
		 int number = scanner.nextInt();
		 int i = number;
		 int armstrongnumber = 0;
		 while(i>0)
		 {
			 armstrongnumber +=Math.pow(i%10, 3);
			 i=i/10;
		 }
		 //System.out.println(armstrongnumber);
		 if(number == armstrongnumber)
			 System.out.println("Number is Armstrong Number");
		 else
			 System.out.println("Number is Armstrong Number");
		 
		 scanner.close();
	}
	}


