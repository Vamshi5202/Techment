package com.tech.customException;


public class Account {
	int bal=5000;
String withdraw(int amount)  {  
	if(amount>bal) {
		
		throw new InsufficientException("insufficient fund");
	}
	else {
		return "you have withrawn "+amount+"amount";
	}
}
}
