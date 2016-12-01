package com.collections.arraytest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CollectionsExample {
	
	public static void main(String args[]){
		
		
		Collection c=new LinkedList<>();
		System.out.println(c.isEmpty());
		c.add("Jan");
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		Iterator itr=c.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		Map m=new HashMap<>();
		Map m1=new HashMap<>();
		Map m2=new HashMap<>();
		Map m3=new HashMap<>();
		
		//user  ,internet usage,  dates,serviceProvider
		
		Map user =new HashMap();
		Map dateUsgaeMap =new HashMap();
		Map ServiceProviderMap =new HashMap();
		
		
		dateUsgaeMap.put("date", "usage");
		ServiceProviderMap.put("sp", dateUsgaeMap);
		Map dateUsgaeMap2 =new HashMap();
		user.put("user1",ServiceProviderMap );
		user.put("user2",dateUsgaeMap2 );
		
		m.put("m1", m1);
		
		
		m1.put("m2", m2);
		m2.put("m3", m3);
		
		//m-->m1-->m2-->m3
		
		
		
	}

}
