package com.lab.ankita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class Insertcolumns 
{
	public static void main(String[] args) throws SQLException,ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","MyLifeLine@123");
		
		//step 3
		Statement stmt=con.createStatement();
		
		//step 4 execute Statement
		int a=stmt.executeUpdate("insert into employees values(NULL,'John','Doe',30)");

		System.out.println("Successfully added employee "+a);

	}

}


mysql> select * from employees;
+-----+------------+------------+------+
| id  | first_name | last_name  | age  |
+-----+------------+------------+------+
| 101 | Ruby       | Roy        |   25 |
| 102 | Colton     | King       |   23 |
| 103 | Zade       | Meadows    |   24 |
| 104 | Cardan     | Greenbriar |   19 |
| 105 | Aaron      | Warnar     |   20 |
| 106 | Kenji      | Kishimoto  |   25 |
| 107 | John       | Doe        |   30 |
+-----+------------+------------+------+
7 rows in set (0.00 sec)