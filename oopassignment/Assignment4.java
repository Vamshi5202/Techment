package com.tech.oopassignment;
class Address1{
	private String addressLine;
	private String city;
	public Address1(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressDetails() {
		return "AddressLine"+getAddressLine()+"city"+getCity();
	}
	

}
class Customer1{
	private String customerName;
	private String officialAddress;
	private Address1 resedentialAddress;
	
	
	public Customer1(String customerName,String officialAddress, Address1 resedentialAddress) {
		super();
		this.customerName = customerName;
		this.officialAddress=officialAddress;
		this.resedentialAddress = resedentialAddress;
	}
	
		// TODO Auto-generated constructor stub
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getofficialAddress() {
		return officialAddress;
	}
	public void setofficialAddress() {
		this.officialAddress=officialAddress;
	}

	public Address1 getResedentialAddress() {
		return resedentialAddress;
	}
	public void setResedentialAddress(Address1 resedentialAddress) {
		this.resedentialAddress = resedentialAddress;
	}
		public void getCustomerDetails() {
		System.out.println("customer:"+getCustomerName());
		System.out.println("Official Address:"+getofficialAddress());
		System.out.println("Resedential Address:"+resedentialAddress.getAddressLine()+","+resedentialAddress.getCity());
	
		/*String result="customer:"+getCustomerDetails()+",Resedential Address:"+resedentialAddress.getAddressLine()+","+resedentialAddress.getCity()+",OfficialAddress"+officialAddress;
	  return result;*/
	}


}

public class Assignment4 {

	public static void main(String[] args) {
		Address1 address=new Address1("1st main hsr layout","hyderabad");
		  Customer1 customer=new Customer1("john","banglore",address);
		  customer.getCustomerDetails();

	}

}
