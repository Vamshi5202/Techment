package com.tech.day9.io;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Techment Excercise\\exam");
		System.out.println(file.exists());
		file.createNewFile();//create a file
		file.mkdir();//create a folder
		System.out.println(file.exists());

	}

}
