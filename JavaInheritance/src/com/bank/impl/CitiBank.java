package com.bank.impl;

public class CitiBank extends CommonBanking {
	int age;
	int empId;

	@Override
	public boolean payCredictCardBill(String cardType, int cardNumber) {
		if (isActive(cardType, cardNumber)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isActive(String cardType, int cardNumber) {
		// TODO Auto-generated method stub
		
		System.out.println("CITI IS Active");
		return  false;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
	

}
