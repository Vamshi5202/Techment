package com.tech.exceptionassignment;

public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();
		
		if(custNo.startsWith("c")||custNo.startsWith("C")) {
		 if(custName.length()>=4) {
			 if(category.contains("platinum")||category.contains("gold")||category.contains("silver")) {
				 this.custNo = custNo;
					this.custName = custName;
					this.category = category;
			 }
			 else {
				 throw new InvalidInputException("category must be platinum,gold,silver");
				 
			 }
			
		 }
		 else {
			 throw new InvalidInputException("Name must be atleast 4 characters");
		 }
		}
		else {
			throw new InvalidInputException(" must start with c or C ");
		}
	
		}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", category=" + category + "]";
	}

}

class InvalidInputException extends Exception {
	String mg;

	public InvalidInputException(String mg) {
		super();
		this.mg = mg;
	}

}

class TestCustomer {
	public static void main(String[] args) {
		try {
			Customer customer = new Customer("14563", "murthy", "gold");
			System.out.println(customer.toString());
		} catch (InvalidInputException e) {

			e.printStackTrace();
		}
	}
}