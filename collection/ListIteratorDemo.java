package com.tech.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList <Integer> a=new ArrayList<Integer>();
	       a.add(1);
	       a.add(2);
	       a.add(3);
	       a.add(4);
	       System.out.println(a);
	  ListIterator<Integer>itr= a.listIterator();
	  System.out.println("forward direction");
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 System.out.println("backward direction");
	  while(itr.hasPrevious()) {
		  System.out.println(itr.previous());
	  }
	}

}
