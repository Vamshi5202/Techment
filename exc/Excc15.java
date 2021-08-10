package com.tech.exc;
import java.util.*;
public class Excc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number of elements in each Array");
		 int number = scanner.nextInt();
		 int check =0;
		 int[] array1 = new int[number];
		 int[] array2 = new int[number];
		 
		 for (int i =0; i < number;i++)
		 {
			 System.out.println("Insert The Number in 1st Array");
			 array1[i]=scanner.nextInt();
		 }
		 
		 for (int i =0; i < number;i++)
		 {
			 System.out.println("Insert The Number in 2nd Array");
			 array2[i]=scanner.nextInt();
		 }
		 
		 
		 for(int i =0;i<number;i++)
		 {
			 if(array1[i]==array2[i])
				 check+=1;
		 }
		 if(check==number)
			 System.out.println("Both Arrays Are Same");
		 else
			 System.out.println("Both Arrays Are Not Same");
		 
		 scanner.close();
	}

	}


