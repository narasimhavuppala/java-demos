package com.jdbcex.dml;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataEx {
	static void printMetadata(ResultSet rs){
		try {
			ResultSetMetaData rsm=rs.getMetaData();
			
			System.out.println("Column Count=" + rsm.getColumnCount());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
