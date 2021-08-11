package com.tech.day8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(5);
	hs.add(4);
	System.out.println("Hashset"+hs);
	LinkedHashSet li=new LinkedHashSet();
	li.add(1);
	li.add(2);
	li.add(5);
	li.add(4);
	System.out.println("Linkedhashset"+li);
	TreeSet ts=new TreeSet();
	ts.add(1);
	ts.add(6);
	ts.add(5);
	ts.add(4);
	ts.add(2);
	// class cast exceptionts.add("murth");
	System.out.println("Treeset"+ts);
	}

}
