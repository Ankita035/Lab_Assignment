package com.lab.ankita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class EmployeeTable 
{

	static final String JDBC_URL = "jdbc:mysql://localhost:3306/meradb";
	static final String USERNAME = "root";
	static final String PASSWORD = "MyLifeLine@123";

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","MyLifeLine@123");
			String createTable = "CREATE TABLE employees (" +
						"id INT PRIMARY KEY AUTO_INCREMENT," +
						"first_name VARCHAR(50)," +
						"last_name VARCHAR(50)," +
						"age INT" +
						")";

			            // Create the statement
			Statement st = con.createStatement();
	
				    // Execute the SQL command to create the table
			st.executeUpdate(createTable);

			System.out.println("Table 'employees' created successfully.");
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
	}
}


mysql> desc employees;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| id         | int         | NO   | PRI | NULL    | auto_increment |
| first_name | varchar(50) | YES  |     | NULL    |                |
| last_name  | varchar(50) | YES  |     | NULL    |                |
| age        | int         | YES  |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
4 rows in set (0.04 sec)