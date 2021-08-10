package com.tech.exc;
import java.util.*;
public class Exc47 {
	 public static void main(String[] args) 
	    {
	        double sum = 0;
	        int n;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the no of series");
	        n = sc.nextInt();
	       Exc47 obj = new Exc47();
	        for(int i = 1; i <= n; i++)
	        {
	            sum = sum + (double)i / (obj.fact(i));
	        }
	        System.out.println("Sum of series:"+sum);
	    }
	    int fact(int x)
	    {
	        int mul = 1;
	        while(x > 0)
	        {
	            mul = mul * x;
	            x--;
	        }
	        return mul;
	    }

}
