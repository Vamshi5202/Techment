package com.tech.exc;
import java.util.*;
public class Excc13 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int max =0;

			 System.out.println("How Many Numbers You Want to Insert");
			 int number = scanner.nextInt();
			 for (int i =0; i < number;i++)
			 {
				 System.out.println("Insert The Number");
				 array[i]=scanner.nextInt();
			 }
			 for (int i=0; i<number; i++)   
			 {
				 if(array[i]>max)
				 {
					 max =array[i];
				 }
			
			 }  
			System.out.println("The Maximum Among All the elements "+max); 
			scanner.close();
		}

	}


