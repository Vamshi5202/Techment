package com.tech.day9.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("abc.txt");
		//FileWriter fw = new FileWriter("abc.txt",true);

		fw.write("hello");
		fw.write(90);
		fw.write(87);
		fw.close();
	}

}
