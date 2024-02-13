package com.gsmart.test.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBReader {

	
	// Method to return first product
	
	public static String getFirstProduct() throws Exception{
		// Step 1 Create the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://15.204.212.46:3306/mishopp1_shopping-cartqa",
				"mishopp1_testuser1", "Test908030");

		// Step 2 Create the statement from Connection
		Statement statment = connection.createStatement();

		// Step 3 Execute query and store results
		ResultSet resultSet = statment.executeQuery("select * from product");
		String productName = null;
		// Step 4 Process the results
		while (resultSet.next()) {

			productName = resultSet.getString("pname");
			System.out.println(" product name from resultset -------- " + productName);
			break;

		}
		
		return productName;
		
	}
	
	
	
	
	// Method to return expensive product
	
	public static String getExpensiveProduct() throws Exception{
		// Step 1 Create the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://15.204.212.46:3306/mishopp1_shopping-cartqa",
				"mishopp1_testuser1", "Test908030");

		// Step 2 Create the statement from Connection
		Statement statment = connection.createStatement();

		// Step 3 Execute query and store results
		ResultSet resultSet = statment.executeQuery("select * from product where pprice>1000");
		String productName = null;
		// Step 4 Process the results
		while (resultSet.next()) {
			productName = resultSet.getString("pname");
			System.out.println(" product name from resultset -------- " + productName);
			break;
		}
		
		return productName;
		
	}
	
	
	
	// Method to return  mobile product
	
	public static String getMobileProduct() throws Exception{
		// Step 1 Create the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://15.204.212.46:3306/mishopp1_shopping-cartqa",
				"mishopp1_testuser1", "Test908030");

		// Step 2 Create the statement from Connection
		Statement statment = connection.createStatement();

		// Step 3 Execute query and store results
		ResultSet resultSet = statment.executeQuery("select * from product where ptype='mobile'");
		String productName = null;
		// Step 4 Process the results
		while (resultSet.next()) {
			productName = resultSet.getString("pname");
			System.out.println(" product name from resultset -------- " + productName);
			break;
		}
		
		return productName;
		
	}
	
	
}
