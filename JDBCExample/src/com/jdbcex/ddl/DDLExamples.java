package com.jdbcex.ddl;

import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcex.dml.MysqlConnection;

public class DDLExamples {

	public static void main(String[] args) throws SQLException {
          CreateTable();
		//DropTable();
	}
	
	static void CreateTable() throws SQLException{
		String SQL="CREATE TABLE Student(id int,studentname varchar(50),age int,address varchar(100))";
		Statement st=MysqlConnection.createConnection().createStatement();
		boolean tableCreated=st.execute(SQL);
		System.out.println(tableCreated);
		
		
	}
	
	static void DropTable() throws SQLException{
		String SQL="DROP TABLE STUDENT";
		Statement st=MysqlConnection.createConnection().createStatement();
		boolean tableCreated=st.execute(SQL);
		System.out.println(tableCreated);
		
		
	}


}
