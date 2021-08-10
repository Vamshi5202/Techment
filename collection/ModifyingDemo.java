package com.tech.collection;

import java.util.ArrayList;

public class ModifyingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Integer> a=new ArrayList<Integer>();
	       a.add(1);
	       a.add(2);
	       a.add(3);
	       a.add(4);
	       System.out.println(a);
	for(int i:a) {
		if(i>3) {
			//a.add(100);
			a.remove(i);
			System.out.println(i);
		}
	}
	}

}
