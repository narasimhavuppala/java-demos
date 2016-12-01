package com.collections;

import java.util.Comparator;

public class StudnetComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("Studnet comparator");
		int returnValue=0;
		
		returnValue=o1.getName().compareTo(o2.getName());
		if(returnValue==0){
			if(o1.getAge() > o2.getAge()){
				returnValue=1;
			}
			else if(o1.getAge() < o2.getAge()){
				
				returnValue=-1;
			}
			
		}
		
		return returnValue;
	}
	
	

	
}
