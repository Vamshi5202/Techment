package com.tech.composition;
class Account{
	int accNo;
	String accType;
	String branch;
	String ifsc;
	public Account(int accNo, String accType, String branch, String ifsc) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.branch = branch;
		this.ifsc = ifsc;
	}
	
}
class Customer{
	int id;
	String name;
	Account account;
	public Customer(int id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
	void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("account number:"+account.accNo);
		System.out.println("account type:"+account.accType);
		System.out.println("Branch:"+account.branch);
		System.out.println("ifsc:"+account.ifsc);


	}
	
	
}
public class Main2 {

	public static void main(String[] args) {
	  Account acc=new Account(1234,"savings","hyderabad","ANDB41256");
	  Customer customer=new Customer(12,"murthy",acc);
	  customer.display();

	}

}
