package com.tech.exc;
import java.util.*;
public class Exc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number of elements in each Array");
		 int number = scanner.nextInt();
		 //int check =0;
		 int[] array1 = new int[number];
		 //int[] array2 = new int[number];
		 
		 for (int i =0; i < number;i++)
		 {
			 System.out.println("Insert The Number in the Array");
			 array1[i]=scanner.nextInt();
		 }
		 System.out.println("Enter The Index number Value You Want To Find : ");
		
		 try
		 {
			 int index = scanner.nextInt();
			 scanner.close();
			 System.out.println("The Desired Index Number Is : " + array1[index-1]);
		/* if(index<=number&&index>0)
		 {
			 
		 }*/
		 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Index Is Out Of Bound");
		 }
						
	}

}
