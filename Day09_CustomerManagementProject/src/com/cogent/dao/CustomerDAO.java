/**
 * 
 */
package com.cogent.dao;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public interface CustomerDAO {
	public void create();
	public void read();
	public void update(String customerID);
	public void delete(String customerID);
	public void findCustomerByID(String cID);
	public void findYoungestCustomer();

}
