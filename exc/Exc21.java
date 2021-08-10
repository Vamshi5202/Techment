package com.tech.exc;

import java.util.*;

class Product {
	private int id;
	private String name;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class Exc21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("number of products");
		int numb = sc.nextInt();
		Product product[] = new Product[numb];
		for (int i = 0; i < numb; i++) {
			System.out.println("id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("price");
			int price = sc.nextInt();
			product[i] = new Product(id, name, price);
		}
		System.out.println("id");
		int searchId=sc.nextInt();
		int c=0;
		for(int i=0;i<=numb;i++) {
			if(searchId==product[i].getId()) {
				System.out.println("name"+product[i].getName());
				System.out.println("name"+product[i].getPrice());
                c=1;
                break;
			}
		}
		if(c==0) {
			System.out.println("item not available");
		}

	}
}
