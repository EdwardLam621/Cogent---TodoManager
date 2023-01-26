/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class Employee {
	 int employeeNo;
	 String employeeName;
	 double employeeSalary;
	 
	 /**
	 * @return the employeeNo
	 */
	public int getEmployeeNo() {
		return employeeNo;
	}
	/**
	 * @param employeeNo the employeeNo to set
	 */
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
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
	 * @return the employeeSalary
	 */
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public String toString() {
		return this.employeeNo + " " + this.employeeName + " " + this.employeeSalary;
	}
	
}
