package com.tech.collectionassignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class States {

	public static void main(String[] args) throws IOException {

		LinkedHashSet<String>stateSet=new LinkedHashSet<String>();
		FileReader fr=new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\Techment Excercise\\states.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			stateSet.add(line);
			line=br.readLine();
		}
		System.out.println("Total number of States:"+stateSet.size());
	    stateSet.remove("delhi");
	    System.out.println("States names starts with K :");
	    for(String states:stateSet) {
	    	if(states.startsWith("k")) {
	    		System.out.println(states);
	    	}
	    }
	    TreeSet<String>tStates=new TreeSet<String>(stateSet);
	    System.out.println("States in sorted Order");
	    System.out.println(tStates);
	}

}
