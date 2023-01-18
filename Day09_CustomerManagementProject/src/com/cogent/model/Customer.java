/**
 * 
 */
package com.cogent.model;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Customer {
	private String cld;
	private String cName;
	private String cEmail;
	private String cDob;
	
	
	
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param cld
	 * @param cName
	 * @param cEmail
	 * @param cDob
	 */
	public Customer(String cld, String cName, String cEmail, String cDob) {
		super();
		this.cld = cld;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cDob = cDob;
	}
	



	/**
	 * @return the cld
	 */
	public String getCld() {
		return cld;
	}
	/**
	 * @param cld the cld to set
	 */
	public void setCld(String cld) {
		this.cld = cld;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the cEmail
	 */
	public String getcEmail() {
		return cEmail;
	}
	/**
	 * @param cEmail the cEmail to set
	 */
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	/**
	 * @return the cDob
	 */
	public String getcDob() {
		return cDob;
	}
	/**
	 * @param cDob the cDob to set
	 */
	public void setcDob(String cDob) {
		this.cDob = cDob;
	}
	
	
}
