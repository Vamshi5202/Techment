package com.tech.exc;
import java.util.*;
public class Exc35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("rows");
		int rows=sc.nextInt();
       for(int i=1;i<=rows;i++) {
    	   
    	   for(int j=1;j<=i;j++) {
    		   System.out.print(j);
    	   }
    	   System.out.println();
       }
       for(int i=rows-1;i>=1;i--) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print(j);
    	   }
    	   System.out.println();
       }
       
	
	}
}
