package com.tech.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	int id;
	String name;
	int price;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantiy=" + quantity + "]";
	}
	
}

class QuantitySorting implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.quantity==o2.quantity) {
			return 0;
		}
		else if(o1.quantity>o2.quantity) {
			return -1;
		}
		else
		return 1;
	}
	
}
class PriceSorting implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price) {
			return 0;
		}
		else if(o1.price>o2.price) {
			return -1;
		}
		else
		return 1;
	}
	
}
public class ComparatorDemo2 {

	public static void main(String[] args) {
	
     ArrayList<Product>prodList=new ArrayList<Product>();
     prodList.add(new Product(1,"ricebag",6000,50));
     prodList.add(new Product(2,"Coffee",900,10));
     prodList.add(new Product(3,"Tomato",300,22));
     prodList.add(new Product(4,"sugar",1000,12));
     System.out.println("========normal products======");
     for(Product product:prodList) {
    	 System.out.println(product);
     }
     System.out.println("====print if price>500======");
     for(Product product:prodList) {
    	 if(product.price>500) {
    		 System.out.println(" id: "+product.id+" Name: "+product.name+" Price: "+product.price+" Quantity: "+product.quantity);
    	 }
     }
    	 System.out.println("=====after Quantity sorting======");
        Collections.sort(prodList,new QuantitySorting());
          for(Product product1:prodList) {
        	  System.out.println(product1);
          }
          System.out.println("======After Price Sorting======");
          Collections.sort(prodList,new PriceSorting());
          for(Product product1:prodList) {
        	  System.out.println(product1);
          }
     }

	}


