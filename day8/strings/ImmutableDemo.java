package com.tech.day8.strings;

public class ImmutableDemo {

	public static void main(String[] args) {
 String courseName="java";
 
 System.out.println(courseName);
 courseName.concat("programming");
 System.out.println("after concat"+courseName);
	courseName=courseName.concat(" language");
	System.out.println(courseName);
	}

}
