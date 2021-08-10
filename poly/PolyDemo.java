package com.tech.poly;

class Hello{
	public void write(int n) {
		System.out.println("Integer");
	}
	public void write(String msg) {
		System.out.println("string");
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		Hello hello=new Hello();
		System.out.println(hello.add(2, 3));
		// TODO Auto-generated method stub

	}

}
