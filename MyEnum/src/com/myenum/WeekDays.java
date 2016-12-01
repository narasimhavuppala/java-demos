/**
 * 
 */
package com.myenum;

/**
 * @author Shree
 *
 */
public enum WeekDays {
	
	
	
	Sunday(10),
	Monday(20),
	Tuesday(30),
	Wednsday(40),
	Thursday(50),
	Friday(60),
	Saturday(70);
	
	int numbering;
	
	private WeekDays(int n){
		this.numbering=n;
	}

}
