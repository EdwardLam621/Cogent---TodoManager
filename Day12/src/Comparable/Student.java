/**
 * 
 */
package Comparable;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Student implements Comparable<Student> {
	
	// Comparable<> is necessary because it won't allow 
	// Collections.sort being compiled without the interface
	
	private int id;
	private String firstName, lastName;
	/**
	 * @param i
	 * @param string
	 * @param j
	 */
	
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.id > o.id) {
			return 1;
		} else if(this.id == o.id) {
			return 0;
		}
		else return -1;
	}
	
	
	@Override
	public String toString() {
		return "ID: " + this.id + " First: " + this.firstName + " Last: " + this.lastName + "\n";
	}
	

}
