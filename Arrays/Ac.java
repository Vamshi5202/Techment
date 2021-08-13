package com.tech.Arrays;

import java.util.LinkedList;
import java.util.Scanner;

 class CricketScoreAnalyzer {

	private LinkedList<Integer> runsData=new LinkedList<Integer>();

	
	public void addRundToList(int scores) {
		runsData.add(scores);
	}
	public void calcRunRate() {
		int sum=0;
		for(int i=0;i<runsData.size();i++) {
			sum=sum+runsData.get(i);
			
		}
		double runrate=sum/50;
		System.out.println("Run Rate:"+runrate);
		
	}
	public void lowestRunsScored() {
		int lowest=50000;
		for(int i=0;i<runsData.size();i++) {
			if(lowest>runsData.get(i)) {
				lowest=runsData.get(i);
			}
		}
		System.out.println("Lowest Score:"+lowest);
	}
	public void displayRuns() {
		for(int i=0;i<runsData.size();i++) {
			System.out.println("Runs Scored by Player"+(i+1)+"-"+runsData.get(i));
		}
	}

	

	

 }
public class Ac{
	public static void main(String[] args) {
		
	
	CricketScoreAnalyzer scoreAnalyzer=new CricketScoreAnalyzer();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of Players");
	int noplayers=sc.nextInt();
	System.out.println("Enter Runs");
	for(int i=0;i<noplayers;i++) {
		int scores=sc.nextInt();
		scoreAnalyzer.addRundToList(scores);
	}
	scoreAnalyzer.displayRuns();
	scoreAnalyzer.calcRunRate();
	scoreAnalyzer.lowestRunsScored();
	
	
}
}