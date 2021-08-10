package com.tech.exc;
import java.util.*;
public class Excc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int number = scanner.nextInt();
		 if(number % 8 ==0 && number % 3 == 0)
			 System.out.println(number + " The Number Is divisible by 8 as well as 3");
		 else
			 System.out.println(number + " The Number Is Not divisible by 8 and 3");
		 
		 scanner.close();
	}

	}


