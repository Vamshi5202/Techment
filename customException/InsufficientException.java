package com.tech.customException;

public class InsufficientException extends RuntimeException{
String message;

public InsufficientException(String message) {
	super(message);
	
}

}
