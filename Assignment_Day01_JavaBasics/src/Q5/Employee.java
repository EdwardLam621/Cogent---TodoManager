/**
 * 
 */
package Q5;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Employee {

	private int employeeNumber;
	private String employeeName;
	private Date joiningDate;
	
	
	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the joiningDate
	 */
	public Date getJoiningDate() {
		return joiningDate;
	}
	/**
	 * @param joiningDate the joiningDate to set
	 */
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	/**
	 * 
	 */
	public Employee() {
		super();
		joiningDate = new Date();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param employeeNumber
	 * @param employeeName
	 * @param joiningDate
	 */
	public Employee(int employeeNumber, String employeeName, Date joiningDate) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}
	
	public String toString() {
		return String.format("%-5s %-20s %s \n", employeeNumber, employeeName, joiningDate);
	}
	
}
