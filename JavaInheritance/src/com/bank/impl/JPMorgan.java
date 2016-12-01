package com.bank.impl;

public class JPMorgan extends CommonBanking {

	@Override
	public boolean payCredictCardBill(String cardType, int cardNumber) {
		if (isActive(cardType, cardNumber)) {
			return true;
		} else {
			return false;
		}
	}

}
