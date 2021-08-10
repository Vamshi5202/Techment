package com.tech.exceptions;
class AgeException extends RuntimeException{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}
class IdNotFoundException extends Exception{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
}


public class CustomException {

	public static void main(String[] args) throws IdNotFoundException {

		throw new IdNotFoundException("not a valid age");
		//throw new AgeException("not a valid age");
	}

}
