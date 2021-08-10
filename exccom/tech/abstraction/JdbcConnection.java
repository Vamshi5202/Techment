package com.tech.exccom.tech.abstraction;

public interface JdbcConnection {
	void connect();
}

class Oracle implements JdbcConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connection through oracle");

	}

}

class Mysql implements JdbcConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connection through mysql");

	}

}

class Main {
	public static void main(String[] args) {
		JdbcConnection oracle = new Oracle();
		oracle.connect();
		

	}
}
