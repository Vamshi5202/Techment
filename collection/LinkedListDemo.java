package com.tech.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList ol=new LinkedList();
	ol.add(1);
	ol.addLast(102);

	ol.add(2);
	ol.addFirst(100);
	System.out.println(ol);
	ol.removeLast();
	System.out.println(ol);
	}

}
