package com.tech.day8.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String>hm = new HashMap();
		hm.put(3, "murthy");// hm.put(1, "reema");
		hm.put(5, "koti");// doesn't maintain insertion
		hm.put(4, "raghu");// doesn't take duplicate keys
		hm.put(1, "siya");
	System.out.println("HashMap" + hm);
  
	//to print both key and value pairs
	for(Entry<Integer, String> e:hm.entrySet()) {
	System.out.println(e);
	System.out.println("key:"+e.getKey());
    System.out.println("value:"+e.getValue());
}
	//to print only values
	for(String val:hm.values()) {
		System.out.println(val);
	}
	//to print only keys
	for(Integer key:hm.keySet()) {
		System.out.println(key);
	}
	

		LinkedHashMap <Integer,String>lm = new LinkedHashMap();

		lm.put(3, "murthy");// lm.put(1, "reema");
		lm.put(5, "koti");// maintains insertion
		lm.put(4, "raghu");// doesn't take duplicate keys
		lm.put(1, "siya");
		System.out.println("LinkedHashMap" + lm);

		TreeMap <Integer,String> tm = new TreeMap();
	
		tm.put(3, "murthy");//tm.put(1, "reema");
		tm.put(5, "koti");//doesn't maintain insertion order 
		tm.put(4, "raghu");//it doesn't take duplicate values
		tm.put(1, "siya");
		System.out.println("TreeMap"+tm);
		

	}

}
