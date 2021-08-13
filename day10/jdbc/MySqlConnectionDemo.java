package com.tech.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) {
		try {
			// step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" class is found");
			// step-2
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false", "root", "12345");
			System.out.println("connected");

			// Connection
			// con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false","root","12345");
			//step-3 statement object
			Statement stmt = con.createStatement();
			//stmt.execute("insert into employee values(2,'sachin',6500)");
		    //System.out.println("inserted");
		   ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		  } 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
