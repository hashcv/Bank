package com.valentyn_tymku.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadDriver {
    public static void main(String[] args) {
        try {


            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("no driver");
        }
        
        Connection conn = null;
       
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hashcv?user=root&password=root");
            

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from test");
            
            while(rs.next()){
            	System.out.println(rs.getInt("p1"));
            	}

           
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        
    }
}