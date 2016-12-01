package com.jdbcex.dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlPreparedStatement {
	
	//Insert
		static void insertIntoStudent(Connection con){
			try {
				//con.setAutoCommit(false);
				String SQL="INSERT INTO STUDENT  VALUES(?,?,?,?)";
				PreparedStatement pst=	con.prepareStatement(SQL);
				pst.setInt(1, 1);
				pst.setString(2, "Vuppala");
				pst.setInt(3, 50);
				pst.setString(4, "Sample Address");
				int rowsInserted=pst.executeUpdate();
				//con.commit();
				System.out.println(rowsInserted);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	
	
	//Retrieve
		static void PrintResults(String SQL,Connection con,String countryCode) {
			try{
			PreparedStatement pst=con.prepareStatement(SQL);
			pst.setString(1, countryCode);
			ResultSet resultSet=pst.executeQuery();
			
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
		}
		

}
