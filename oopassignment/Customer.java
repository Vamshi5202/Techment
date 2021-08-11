package com.tech.oopassignment;

public class Customer {
	private String customerName;
	private Address resedentialAddress;
	Customer(){
		
	}
	public Customer(String customerName, Address resedentialAddress) {
		super();
		this.customerName = customerName;
		this.resedentialAddress = resedentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResedentialAddress() {
		return resedentialAddress;
	}
	public void setResedentialAddress(Address resedentialAddress) {
		this.resedentialAddress = resedentialAddress;
	}
	public void getCustomerDetails() {
		System.out.println("Customer:"+customerName);
		System.out.println("Resedential Address:"+resedentialAddress.getAddressLine()+","+resedentialAddress.getCity());
	/*return "customer:"+getCustomerDetails()+",Resedential Address:"+resedentialAddress.getAddressLine()+","+resedentialAddress.getCity();*/
	}

}
