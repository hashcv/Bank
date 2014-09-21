package com.valentyn_tymku.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
	private static Connection conn;
	private static Statement st;

	public Mysql() {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			System.out.println("no driver");
		}

		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/hashcv?user=root&password=");
			st = getConnection().createStatement();

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	public static Connection getConnection() {
		return conn;
	}

	public static Statement getStatement() {
		return st;
	}
	
	public static void queryNoRs(String sql) {
		try {
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public static ResultSet queryRs(String sql) {
		try {
			return st.executeQuery(sql);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return null;
		}
		
		
	}
}