package com.exce.checked;

import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptions {

	public static void main(String[] args)  {
		try {
			CheckedExceptions obj=new CheckedExceptions();
			obj.print();
			
			
			////100 lines
			
		} catch (Exception e) {
			//System.out.println(e.getErrorMessage());
			System.out.println(e.getMessage());
			
		}
		finally{
			//System.out.println("gurantee excution");
			
		}
	}
	
	
	void print() throws NoItemsInTheCart{
		//
		throw new  Error("Error happ[p");
	}

}
