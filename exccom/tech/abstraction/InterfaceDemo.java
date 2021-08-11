package com.tech.exccom.tech.abstraction;

interface One{
	void greet();
}
interface Two{
	void greet2();
}
class Employee extends Manager implements One,Two{

	@Override
	public void greet2() {
		// TODO Auto-generated method stub
		System.out.println("greet2");
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("greet");
	}
	
}
class Manager{
	void region() {
		System.out.println("Region");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     One one=new Employee();
     one.greet();
     Two two=new Employee();
     two.greet2();
   
     
	}

}
