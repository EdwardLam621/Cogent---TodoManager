/**
 * 
 */
package Day10_App01_Streams;

import java.io.Serializable;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Employee implements Serializable {

	int id;
	String name;
	int salary;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
