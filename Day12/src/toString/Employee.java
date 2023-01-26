/**
 * 
 */
package toString;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Employee {
	private int eNo;
	private String first,last;
	private double sal;
	/**
	 * @return the eNo
	 */
	public int geteNo() {
		return eNo;
	}
	/**
	 * @param eNo the eNo to set
	 */
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	/**
	 * @return the first
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	/**
	 * @return the last
	 */
	public String getLast() {
		return last;
	}
	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
	}
	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	/**
	 * @param eNo
	 * @param first
	 * @param last
	 * @param sal
	 */
	public Employee(int eNo, String first, String last, double sal) {
		super();
		this.eNo = eNo;
		this.first = first;
		this.last = last;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", first=" + first + ", last=" + last + ", sal=" + sal + "]";
	}
	
	
	
}
