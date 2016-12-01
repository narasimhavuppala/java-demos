package com.jdbcex.dml;

import java.sql.Connection;
import java.sql.SQLException;



public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection mysqlConnection=MysqlConnection.createConnection();
		String SQL="SELECT * FROM City WHERE CountryCode='IND'";
		String PSQL="SELECT * FROM City WHERE CountryCode=?";
		MysqlStatement.PrintResults(SQL, mysqlConnection);
		MysqlPreparedStatement.PrintResults(PSQL, mysqlConnection,"USA");
		//MysqlStatement.insertIntoStudent(mysqlConnection);
		//MysqlPreparedStatement.insertIntoStudent(mysqlConnection);
		
		

	}

}
