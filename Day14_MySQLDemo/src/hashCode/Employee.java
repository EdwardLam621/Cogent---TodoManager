/**
 * 
 */
package hashCode;

import java.util.ArrayList;

/**
 * @author : Edward Lam
 * @date   : 2023-01-27
 */
public class Employee {

	int empid;
	String empname;
	
	
	@Override
	public int hashCode() {
		//convert all non-string attributes to String
		String eid = empid +"";
		
		// call hashCode to all attribute;
		int hash = 0;
		hash = eid.hashCode() + empname.hashCode();
		
		return hash;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Employee)
			return false;
		Employee x = (Employee) o;
		return (this.empname.equals(x.empname) && this.empid == x.empid);
		
	}
	

}

