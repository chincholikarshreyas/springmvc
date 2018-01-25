package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbOperation {
	public Connection start()
	{ 
		Connection con=null;
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
