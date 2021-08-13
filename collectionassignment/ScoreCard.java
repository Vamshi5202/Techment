package com.tech.collectionassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScoreCard {

	public static void main(String[] args) {
		HashMap<String, Integer> batsmensScore = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		batsmensScore.put("rahane", 20);
		batsmensScore.put("rahul", 30);
		batsmensScore.put("kohli", 150);
		batsmensScore.put("dhoni", 50);
		batsmensScore.put("lokesh", 20);

		/*
		 * for(int i=0;i<batsmensScore.size();i++) {
		 * System.out.println("Enter Player Name"); String playerName=sc.next();
		 * System.out.println("Enter Score"); int score=sc.nextInt();
		 * batsmensScore.put(playerName, score);
		 * 
		 * 
		 * }
		 */
		System.out.println("Players who batted");

		for (String key : batsmensScore.keySet()) {
			System.out.println(key);
		}
		System.out.println("Scores by Players");
		for (Entry<String, Integer> entry : batsmensScore.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		int sum = 0, max = 0;
		for (Entry<String, Integer> entry : batsmensScore.entrySet()) {

			Integer value = entry.getValue();
			if (max < value) {
				max = value;
			}
			sum = sum + value;
		}
		System.out.println("Total Score:" + sum);

		for (Entry<String, Integer> entry : batsmensScore.entrySet()) {

			Integer value = entry.getValue();
			if (value == max) {
				System.out.println("Name of highest scorer:" + entry.getKey());
			}
			if (entry.getKey() == "dhoni") {
				System.out.println("Runs scored by Dhoni:" + value);
			}
		}

	}

}
