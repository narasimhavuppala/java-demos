package com.ser.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		
		   Address address = new Address();
		   address.setStreet("Street");
		   address.setCountry("India");

		   try{

			FileOutputStream fout = new FileOutputStream("F:\\workspace\\JavaSerializationExample\\address.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");

		   }catch(Exception ex){
			   ex.printStackTrace();
		   }

	}

}
