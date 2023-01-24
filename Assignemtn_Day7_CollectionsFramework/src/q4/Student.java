/**
 * 
 */
package q4;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class Student implements Comparable<Student> {
	private String name, address;
	int SID, age;

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
	public Student(String name, String address, int sID, int age) {
		super();
		this.name = name;
		this.address = address;
		SID = sID;
		age = age;
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
	public int getSID() {
		return SID;
	}

	/**
	 * @param sID the sID to set
	 */
	public void setSID(int sID) {
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

	@Override
	public String toString() {
		return "Student Name: " + name + " RollID=" + SID + "\n";
	}

	@Override
	public int compareTo(Student o) {
		if(this.SID < o.SID) {
			return -1;
		} else if(this.SID == o.SID) {
			return 0;
		} else return 1;
	}
	
	
	
}
