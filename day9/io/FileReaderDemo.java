package com.tech.day9.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
FileReader fr=new FileReader("abc.txt");
int ch=fr.read();
System.out.println(ch);
while(ch!=-1) {
	System.out.println(ch);
	ch=fr.read();//increment
	
	
}

	}

}
