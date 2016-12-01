/**
 * 
 */
package com.javareflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Shree
 *
 */
public class JavaReflectionExample {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws  IllegalArgumentException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		//Student objStudent=new Student(1,"narasimha",25,"Sample Address");
		
		//Class<? extends Student> c=objStudent.getClass();
		
		Class c=Class.forName(Student.class.getName());
		
		//Create new instance
		//System.out.println(c.newInstance());
		Constructor<Student>[] constructors=(Constructor<Student>[]) c.getConstructors();
		for(Constructor con:constructors){
			Student objStudentreflect=(Student) con.newInstance(1,"narasimha",25,"Sample Address");
			System.out.println(objStudentreflect);
			
		}
		

	}

}
