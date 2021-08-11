package com.tech.oopassignment;

public class TestCustomer {

	public static void main(String[] args) {
		Address address = new Address("1st main hsr layout", "hyderabad");
		Customer customer = new Customer("john", address);
		customer.getCustomerDetails();
		// addr.getAddressDetails();
		/*
		 * customer.setCustomerName("John"); customer.setResedentialAddress(new
		 * Address("1st main Street","hyderabad"));
		 * System.out.println(customer.getCustomerName());
		 * System.out.println(address.getAddressLine()+","+address.getCity());
		 */

	}

}
