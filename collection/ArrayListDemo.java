package com.tech.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList();
		System.out.println("size before" + obj.size());
		obj.add(1);
		obj.add("murthy");
		System.out.println("size after" + obj.size());
		System.out.println(obj);
		obj.add(1, 6);
		System.out.println(obj);
		obj.remove("murthy");
		obj.remove(Integer.valueOf(1));
		System.out.println("element at 0th index" + obj.get(0));
	}

}
