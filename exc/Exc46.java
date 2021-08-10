package com.tech.exc;

import java.util.*;

class Products implements Comparable<Products>{
	int id;
	String name;
	int price;
	public Products(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Products o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
class NameCompare implements Comparator<Products>{

	@Override
	public int compare(Products o1, Products o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

public class Exc46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number of products");
		int n=sc.nextInt();
		Products [] products=new Products[n];
		for (int i = 0; i < n; i++) {
			System.out.println("id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("price");
			int price = sc.nextInt();
			products[i] = new Products(id, name, price);
		}
		NameCompare compare=new NameCompare();
		Arrays.sort(products,compare);
		//System.out.println(Arrays.toString(products));
		for(Products p:products) {
			System.out.println(p);
		}
		

	}

}
