/**
 * 
 */
package com.bank.impl;

import com.bank.Banking;

/**
 * @author Shree
 *
 */
public   class CommonBanking extends java.lang.Object implements Banking {

private void isValid(){}
	
	public boolean isActive(String cardType, int cardNumber){
		System.out.println("Common Banking");
		return true;
		
	}

	@Override
	public  boolean payCredictCardBill(String cardType, int cardNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
