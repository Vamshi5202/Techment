package com.tech.exc;
import java.util.*;
public class Exc23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("weight");
		double w=sc.nextInt();
		System.out.println("height");
		int h=sc.nextInt();
		double BMI=w/(h*h);
		if(BMI<(18.5)) {
			System.out.println("underweight");
		}
		else if(BMI>18.5&&BMI<25) {
			System.out.println("normal");
		}
		else if(BMI>25&&BMI<30) {
			System.out.println("overweight");
		}
		else if(BMI>30) {
			System.out.println("obese");
		}

	}

}
