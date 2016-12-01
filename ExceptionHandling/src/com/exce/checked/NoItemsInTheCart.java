package com.exce.checked;

public class NoItemsInTheCart extends Exception {
	
	String errorMessage;
	public NoItemsInTheCart(String message){
		//super(message);		
		this.errorMessage=message;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	

}
