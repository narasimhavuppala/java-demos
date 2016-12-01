/**
 * 
 */
package com.collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Shree
 *
 */
public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set myHashSet=new HashSet();
		Set myLinkedHashSet=new LinkedHashSet();
		Set myTreeSet=new TreeSet();
		
		//(1,2),(2,3),(3,4)
		//(1,null,(2,null),(3,null)
		
		
		
		Map myMap=new HashMap();
		
		System.out.println("*************HashSet**********************");
		for (int i=0;i<10; i++){
			myHashSet.add(i);
			myHashSet.add(i*5);
		}
		System.out.println(myHashSet);
		
		System.out.println("*************LinkedHashSet**********************");
		for (int i=0;i<10; i++){
			myLinkedHashSet.add(i);
			myLinkedHashSet.add(i*5);
		}
		System.out.println(myLinkedHashSet);
		
		//7989027128
		
		
		System.out.println("*************TreeSet**********************");
		for (int i=0;i<10; i++){
			myTreeSet.add(i);
			myTreeSet.add(i*5);
		}
		System.out.println(myTreeSet);
		
		
		
		//SortedSet sortedSet;
		//NavigableSet navigableSet;
		
		
		//HashMap--Plain Map
		//LinkedHashMap --extra Insertion order
		//TreeMap --Sorted behaviour and Flexibility in retrival --Frequent retrivals

	}

	
}
