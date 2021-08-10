package com.tech.oopassignment;

import java.util.Scanner;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public Book() {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	

}
class EngineeringBook extends Book{
	private String category;
	private Book book;
	public EngineeringBook(String category, Book book) {
		super();
		this.category = category;
		this.book = book;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	
	
	



	
}
class BookDetails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("bookno");
		int bookNo=sc.nextInt();
		System.out.println("title");
		String title = sc.next();
		System.out.println("author");
		String author=sc.next();
		System.out.println("price");
		float price=sc.nextFloat();
		
		Book book=new Book();
		/*book.setAuthor(author);
		book.setBookNo(bookNo);
		book.setPrice(price);
		book.setTitle(title);*/
		System.out.println(book.getAuthor()+","+book.getBookNo()+","+book.getPrice()+","+book.getTitle());
	
	EngineeringBook engbook=new EngineeringBook("history");
	System.out.println("category");
	String category=sc.next();
	engbook.setCategory(category);
	System.out.println(book.getAuthor()+","+book.getBookNo()+","+book.getPrice()+","+book.getTitle()+","+engbook.getCategory());

	
	}
	
}
