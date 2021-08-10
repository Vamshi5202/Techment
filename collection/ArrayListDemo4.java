package com.tech.collection;

import java.util.*;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList batch1 = new ArrayList();
		batch1.add("sachin");
		batch1.add("ravi");
		batch1.add("kumar");
		batch1.add("sowmya");

		ArrayList batch2 = new ArrayList();
		batch2.add("sourab");
		batch2.add("manish");
		batch2.add("sachin");
		batch2.add("ankit");
		batch2.add("kumar");

		batch2.addAll(batch1);
		System.out.println(batch2);

		ArrayList batch3 = new ArrayList();
		for (Object element : batch2) {
			if (!batch3.contains(element)) {
				batch3.add(element);
			}
		}
		System.out.println(batch3);
        Collections.sort(batch3);
        System.out.println(batch3);
	}

}
