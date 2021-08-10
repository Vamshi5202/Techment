package com.tech.oop;
class Bank{
	public void rate() {
		System.out.println("3%");
	}
	public void  openAcc() {
		System.out.println("acc");
	}
}
class SBI extends Bank{
	public void rate() {
		System.out.println("5%");
	}
	public void loan() {
		System.out.println("loan");
	}
	

	
}
class Axis extends Bank{
	public void rate() {
		System.out.println("7%");
	}
	public void loan() {
		System.out.println("loan");
	}
	
}
//

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SBI sbi=new SBI();
  Axis axis=new Axis();
  axis.rate();
  sbi.rate();
  Bank bank=new SBI();
    bank.openAcc();
    bank.rate();
	}

}
