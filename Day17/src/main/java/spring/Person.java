/**
 * 
 */
package spring;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class Person {
	private int personID, personAge;
	private String personName;
	
	/**
	 * @param personID
	 * @param personAge
	 * @param personName
	 */
	public Person(int personID, String personName, int personAge) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.personAge = personAge;
		
	}
	
	
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the personID
	 */
	public int getPersonID() {
		return personID;
	}
	/**
	 * @param personID the personID to set
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	/**
	 * @return the personAge
	 */
	public int getPersonAge() {
		return personAge;
	}
	/**
	 * @param personAge the personAge to set
	 */
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personID=" + personID + ", personAge=" + personAge + ", personName=" + personName + "]";
	}
	
	
	
}
