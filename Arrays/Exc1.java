package com.tech.Arrays;
import java.util.*;
public class Exc1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int[]array=new int[size];
		System.out.println("array");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int max=array[0];
		int secondmax=array[0];
		int min=array[0];
		int secondmin=array[0];
		for(int i=0;i<array.length;i++) {
		      if(array[i]>max) {
		    	  secondmax=max;
		    	  max=array[i];
		      }
		      else if(array[i]>secondmax) {
		    	  secondmax=array[i];
		      }
			}
		for(int i=0;i<array.length;i++) {
		      if(array[i]<min) {
		    	  secondmin=min;
		    	  min=array[i];
		      }
		      else if(array[i]<secondmin) {
		    	  secondmin=array[i];
		      }
			}
		System.out.println("secondmax"+secondmax);
		System.out.println("secondmini"+secondmin);
		
		}
	

	}


