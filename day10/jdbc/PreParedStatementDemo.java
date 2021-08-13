package com.tech.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreParedStatementDemo {

	public static void main(String[] args) {
		try {
			// step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" class is found");
			// step-2
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false", "root", "12345");
			System.out.println("connected");
		
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, 30);
		ps.setString(2, "rahul");
		ps.setInt(3, 4500);
		ps.execute();
		System.out.println("inserted");
		} catch (Exception e) {
         e.printStackTrace();
		}
	}

}
