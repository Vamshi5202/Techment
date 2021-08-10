package com.tech.oopassignment;

import java.util.*;

class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;

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

	public Book(int bookNo, String title, String author, float price) {
		super();
		setBookNo(bookNo);
		setAuthor(author);
		setTitle(title);
		setPrice(price);
	}

}

class EngineeringBook {
	private String category;
	private Book book;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public EngineeringBook(String category, Book book) {
		super();
		this.category = category;
		this.book = book;
	}

	public void displayall() {
		System.out.println(" Category  : " + category);
		System.out.println(" Number of Book  : " + book.getBookNo());
		System.out.println(" Author of the Book : " + book.getAuthor());
		System.out.println("Title of the Book  : " + book.getTitle());
		System.out.println(" Price of the Book  : " + book.getPrice());
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Book Number : ");
		int booknumber = scanner.nextInt();

		System.out.println("Enter the Book Title : ");
		String BookTitle = scanner.next();

		System.out.println("Enter the Book Author : ");
		String setAuthor = scanner.next();

		System.out.println("Enter The Book Price : ");
		float Price = scanner.nextFloat();

		Book book = new Book(booknumber, BookTitle, setAuthor, Price);
		System.out.println("Enter the Category of Book : ");
		String category = scanner.next();
		EngineeringBook engineeringBook = new EngineeringBook(category, book);
		engineeringBook.displayall();
		scanner.close();

	}

}
