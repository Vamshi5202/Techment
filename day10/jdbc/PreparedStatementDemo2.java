package com.tech.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" class is found");
			// step-2
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false", "root", "12345");
			System.out.println("connected");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			System.out.println("enter no of Employees");
			int emp = sc.nextInt();
			for (int i = 0; i < emp; i++) {
				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println("enter name");
				String name = sc.nextLine();
				System.out.println("enter salary");
				int salary = sc.nextInt();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
				ps.execute();
			}
			System.out.println("inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
