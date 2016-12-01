package com.jdbcex.dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlStatement {
	//CRUD
	
	//Create
	
	
	//Insert
	static void insertIntoStudent(Connection con){
		try {
			//con.setAutoCommit(false);
			String SQL="INSERT INTO STUDENT  VALUES(2,'Narasimha',25,'Hyderabad')";
			Statement st=	con.createStatement();
			int rowsInserted=st.executeUpdate(SQL);
			//con.commit();
			System.out.println(rowsInserted);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	//Retrieve
	static void PrintResults(String SQL,Connection con) {
		Statement st=null;
		try{
		 st=con.createStatement();
		 
		ResultSet resultSet=st.executeQuery(SQL);
		//ResultSetMetaData md=resultSet.getMetaData();
		//ResultSetMetaDataEx.printMetadata(resultSet);
		
		while(resultSet.next()){
			
			System.out.print(resultSet.getInt(1));
			System.out.print("-" + resultSet.getString(2));
			System.out.print("-" + resultSet.getString(3));
			System.out.print("-" + resultSet.getString(4));
			System.out.println("-" + resultSet.getInt(5));
			//System.out.println("-" + resultSet.getString(6));
			
		}
		
		
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			
		}
		finally{
			if(st !=null){
				
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			           
			
		}
	}
	
	//Update
	
	//Delete

}
