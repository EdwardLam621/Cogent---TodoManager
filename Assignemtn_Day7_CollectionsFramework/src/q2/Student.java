/**
 * 
 */
package q2;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class Student {
	private String name, address, SID;
	int age;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param address
	 * @param sID
	 * @param dOB
	 * @param age 
	 */
	public Student(String name, String address, String sID, int age) {
		super();
		this.name = name;
		this.address = address;
		SID = sID;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the sID
	 */
	public String getSID() {
		return SID;
	}

	/**
	 * @param sID the sID to set
	 */
	public void setSID(String sID) {
		SID = sID;
	}

	/**
	 * @return the dOB
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param dOB the dOB to set
	 */
	public void setAge(String age) {
		age = age;
	}
	
	
}
