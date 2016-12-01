package com.javareflection;
import java.lang.annotation.Target;

public class Student implements Comparable<Object>{
	
	private int id;
	private String name;
	private int age;
	private String address;
	
	
	
	public Student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	/*public void setAge(int age) {
		this.age = age;
	}*/
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
		  Student obj=(Student)o;
		  System.out.println("in Compa");
		  //this.age=50;
		  return this.name.compareTo(obj.getName());
		}
		return 6;
		
	}
	
	public String toString(){
		return "Id=" + id + " Name =" + name + "  Age=" + age+ "  Address=" + address;
		
		
	}
	
	

}
