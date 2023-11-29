package com.ust.demo._april_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Connection con= DriverManager.getConnection(null);
        Statement st =con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM BRANCH");
        while(rs.next()) {
        	
        }
    }
}
