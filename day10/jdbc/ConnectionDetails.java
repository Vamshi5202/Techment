package com.tech.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {
	public static Connection getConnected() throws SQLException, ClassNotFoundException {
		Class.forName(ConnectionProperty.DRIVER_NAME);
		Connection con = DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.USERNAME,ConnectionProperty.PASSWORD);
		System.out.println("succesfully completed");
		return con;
	}
}
