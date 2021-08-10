package com.tech.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("elements are"+a1);

		ArrayList a2 = new ArrayList();
		a2.add(100);
		a2.add(102);
		a2.add(103);
		a2.add(1);
		a2.add(5);
	  //a2.addAll(a1);
		
		System.out.println("elements are"+a2);
		//a2.removeAll(a1);
		//a2.retainAll(a1);
		Collections.sort(a2);
		System.out.println("elements are"+a2);


	}

}
