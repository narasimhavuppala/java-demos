/**
 * 
 */
package com.test;

import com.bank.Banking;
import com.bank.impl.CitiBank;
import com.bank.impl.JPMorgan;

/**
 * @author Shree
 *
 */
public class TestMain {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Banking cb1=new CitiBank();
		Banking cb2=new JPMorgan();

		System.out.println(cb1.payCredictCardBill("VISA", 12343));
		System.out.println(cb2.payCredictCardBill("MASTER", 1237843));

	}

}
