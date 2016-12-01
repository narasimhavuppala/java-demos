/**
 * 
 */
package om.variables;

/**
 * @author Shree
 *
 */
public class VariablesDemo {
	
	static int ssnNumber;
	int age;
	boolean ismarried;

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		VariablesDemo obj=	new VariablesDemo();
		obj.print();

	}
	
	void print(){
		
		int counter=14;
		System.out.println(counter);
		System.out.println(ismarried);
		System.out.println(VariablesDemo.ssnNumber);
	}

}
