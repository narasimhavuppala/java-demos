/**
 * 
 */
package com.collections.arraytest;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Shree
 *
 */
public class VecotrExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Vector monthNames=new Vector();
        for(int i=0;i<1000;i++){
        	monthNames.add("January" + i);
        	//  System.out.println(monthNames.capacity() + "Index -" + i);
        }
             Iterator e=  monthNames.iterator();
     while(e.hasNext()){
    	 
    	 System.out.println(e.next());
    	 e.remove();
    	 
     }
      
	}

}
