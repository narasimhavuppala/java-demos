/**
 * 
 */
package com.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * @author Shree
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//add,remove,search,storage,duplicates
		// 0,1,2,3,4,5,6,7,8,9,0--More retrivals
		//0->1->2->3->4->9->5->6->7--More adds and delets

		// ArrayList
		System.out.println("**********************Array List*****************************");
		List myArrayList = new java.util.ArrayList();
		for (int i = 0; i < 10; i++) {

			myArrayList.add(i);
			
			
		}
		//myArrayList.add(5, "5");
		
		//readCollections(myArrayList);
		//measureAddPerformance(myArrayList);


		// Linked List
		System.out.println("**********************Linked List*****************************");
		List myLinkedList = new java.util.LinkedList();
		for (int i = 0; i < 10; i++) {

			myLinkedList.add(i);
			
			
		}
		//myLinkedList.add(5, "5");
		//measureAddPerformance(myArrayList);		
		//readCollections(myLinkedList);


		// Vector
		System.out.println("**********************Vector*****************************");
		List myVector = new java.util.Vector();
		for (int i = 0; i < 10; i++) {

			myVector.add(i);
			
		}
		//myVector.add(5, "5");
		//readCollections(myVector);
		removeBehaviour(myVector);

		System.out.println("**********************Stack*****************************");
		// Stack
		List myStack = new java.util.Stack();
		for (int i = 0; i < 10; i++) {

			myStack.add(i);
			//myStack.add(5, "5");
		}
		//myStack.add(5, "5");
	//	readCollections(myStack);
	//	removeBehaviour(myStack);
	}

	static void readCollections(List list) {
		
		//Backward traversing and extracting index and update
		
		//Forward
		/*Iterator forward = list.iterator();
        while (forward.hasNext()) {
			System.out.println(forward.next());
        	
			
		}*/
        
		//Backward
        ListIterator backward = list.listIterator(list.size());
		while (backward.hasPrevious()) {
			System.out.println(backward.previous());
			//System.out.println(backward.nextIndex());
			//backward.set(i);
		}
		
		
		
		
		
		
	}
	static void removeBehaviour(List list){
		
		//Using special Features in implementaions
		if(list instanceof Stack){
			System.out.println("pop" + ((Stack) list).pop());
			System.out.println("peek" + ((Stack) list).peek());
			System.out.println("push" + ((Stack) list).push("13"));
			System.out.println("peek" + ((Stack) list).peek());
		}
		if(list.remove("6")){
			System.out.println("Removed 6");
		}
		
		readCollections(list);
		
		
	}
	static void  measureAddPerformance(List list){
		for(int i =0;i<1000000;i++){
			list.add(i);
			
		}

		long startTime=System.currentTimeMillis();
		for(int i =0;i<1000000;i++){
			list.remove(i);
			
		}

		
				long endTime=System.currentTimeMillis();
		System.out.println("Time for Addition="+ (endTime - startTime));
		
	}

}
