package com.jdbcex.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	
	public static Connection createConnection(){
		Connection connection=null;
		
		
		String DB_DRIVER="com.mysql.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/world";
		try {
			
			Class.forName(DB_DRIVER);
			
			 connection=DriverManager.getConnection(URL, "root", "MYSQL");
			 //connection.setAutoCommit(true);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
		
		
		
	}

}
