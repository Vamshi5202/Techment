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
		
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}
	
}
class Manager{
	void region() {
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
