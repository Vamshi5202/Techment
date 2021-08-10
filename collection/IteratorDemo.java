package com.tech.collection;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList <Integer> a=new ArrayList<Integer>();
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(4);
       System.out.println(a);
       Iterator<Integer>it=a.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }


	}

}
