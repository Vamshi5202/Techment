package com.tech.exccom.tech.abstraction;
interface Bank3{
	void rateOfInterest();
}
class Axis3 implements Bank3{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("7");
	}
	
}
class Kotak3 implements Bank3{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println('9');
	}
	
}


public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bank3 bank=new Axis3();
    bank.rateOfInterest();
	}

}
