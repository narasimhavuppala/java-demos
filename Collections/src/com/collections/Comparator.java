package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one="First";
		String two="Second";
		
		//System.out.println(one.compareTo(two));
		
		//> 0 greater
		//==0 Equal
		
		//< 0  smaller
		
		Student studnet1=new Student(1, "NameTwo", 10, "Address-1");
		Student studnet2=new Student(2, "NameTwo", 12, "Address-2");
		/*Student studnet3=new Student(3, "NameThree", 13, "Address-3");
	//	Student studnet4=new Student(4, "NameFour", 14, "Address-4");
		List<Student> objStudent=new ArrayList<>();*/
		/*System.out.println(studnet1.getAge());
		System.out.println(studnet1.compareTo(studnet2));
		System.out.println(studnet1.getAge());*/
		
		List<Student> objList=new ArrayList<>();
		objList.add(studnet1);
		objList.add(studnet2);
		
		StudnetComparator objCom=new StudnetComparator();
		//System.out.println(objCom.compare(studnet1, studnet2));
		//Collections.sort(list);
		
		Collections.sort(objList);
		//Collections.sort(objList, objCom);
		for(Student s:objList){
			System.out.println(s.getId());
			break;
		}
		
	//	System.out.println(objList);
		
		//this
		//only one member com
		//Generic

	}
}
