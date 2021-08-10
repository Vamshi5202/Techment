package com.tech.composition;
class Employee{
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	String displayEmployee() {
		/*System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("doorno:"+address.doorno);
		System.out.println("streetname:"+address.streetName);
		System.out.println("city:"+address.city);
		System.out.println("pincode:"+address.pincode);*/
  return "id:"+id+",name:"+name+",doorno:"+address.doorno+",streetname"+address.streetName+",city"+address.city+",pincode"+address.pincode;



	}
	
}
class Address{
	int doorno;
	String streetName;
	String city;
	int pincode;
	public Address(int dorrno, String streetName, String city, int pincode) {
		super();
		this.doorno = dorrno;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	
}


public class HasArelationship {

	public static void main(String[] args) {
		Address addr=new Address(100,"bts","hyderabad",509876);
		Employee employee=new Employee(1,"vk",addr);
		System.out.println(employee.displayEmployee());

	}

}
