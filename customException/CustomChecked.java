package com.tech.customException;

class LateException extends Exception {
	public LateException(String msg) {
		super(msg);
	}
}

class Student {
	void login(int time) throws LateException {
		if (time > 9) {
			throw new LateException("you are absen");
		} else {
			System.out.println("you are present");
		}
	}
}

public class CustomChecked {
	public static void main(String[] args) {
		Student student = new Student();
		try {
			student.login(9);
		} catch (LateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
