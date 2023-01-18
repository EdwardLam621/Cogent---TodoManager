/**
 * 
 */
package com.cogent.service;

import com.cogent.dao.CustomerDAOImple;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class CustomerService {
	
	CustomerDAOImple dao;
	
	/**
	 * 
	 */
	public CustomerService() {
		super();
		dao = new CustomerDAOImple();
	}

	
	public void save() {
		dao.create();
	}
	
	public void fetch() {
		dao.read();
	}
	
	public void modify(String cid) {
		dao.update(cid);
	}
	
	public void delete(String cid) {
		dao.delete(cid);
	}

	public void fetchYoungest() {
		dao.findYoungestCustomer();
	}

	public void fetchByID(String cid) {
		dao.findCustomerByID(cid);
	}

	
}

