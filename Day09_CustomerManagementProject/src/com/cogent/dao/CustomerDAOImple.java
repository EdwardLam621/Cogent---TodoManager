/**
 * 
 */
package com.cogent.dao;

import java.util.Scanner;

import com.cogent.exception.MandatoryFieldException;
import com.cogent.model.Customer;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class CustomerDAOImple implements CustomerDAO{

	Customer customers[];
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void create() {

		System.out.println("How many customer you want to store? ");
		int size = sc.nextInt();
		customers = new Customer[size];
		for(int i = 0; i < size; i++) {
			Customer c = new Customer();
			System.out.println("Please enter customer ID");
			String cid = sc.next();
			System.out.println("Please enter customer name");
			String cName = sc.next();
			System.out.println("Please enter customer Email");
			String cEmail = sc.next();
			System.out.println("Please enter customer Date of Birth");
			String cDOB = sc.next();
			c.setcDob(cDOB);
			c.setcEmail(cEmail);
			c.setCld(cid);
			c.setcName(cName);
			validateMandatoryField(c);
			customers[i] = c;
		}
		
	}

	@Override
	public void read() {
		
		for(int i = 0; i < customers.length; i++) {
			System.out.println("Customer ID: " + customers[i].getCld());
			System.out.println("Customer Name: " + customers[i].getcName());
			System.out.println("Customer Email: " + customers[i].getcEmail());
			System.out.println("Customer Date of Birth: " + customers[i].getcDob());
		}
		
	}

	@Override
	public void update(String cid) {
		
		for(int i = 0; i < customers.length; i++) {
			if(customers[i].getCld().equals(cid)) {
				Customer c = new Customer();
				System.out.println("Please enter UPDATED customer name");
				String cName = sc.next();
				System.out.println("Please enter UPDATED customer Email");
				String cEmail = sc.next();
				c.setcEmail(cEmail);
				c.setcName(cName);
				c.setcDob(customers[i].getcDob());
				c.setCld(customers[i].getCld());
				validateMandatoryField(c);
				customers[i] = c;
				break;
			}
		}
	}

	@Override
	public void delete(String customerID) {
		
		for(int i = 0; i < customers.length; i++) {
			if(customers[i].getCld().equals(customerID)) {
				Customer c = new Customer();
				customers[i] = c;
				break;
			}
		}
	}

	@Override
	public void findCustomerByID(String cID) {
		
		for(int i = 0; i < customers.length; i++) {
			if(customers[i].getCld().equals(cID)) {
				System.out.println("Customer ID: " + customers[i].getCld());
				System.out.println("Customer Name: " + customers[i].getcName());
				System.out.println("Customer Email: " + customers[i].getcEmail());
				System.out.println("Customer Date of Birth: " + customers[i].getcDob());
				break;
			}
		}
		System.out.println("Customer is not found");
		
	}

	@Override
	public void findYoungestCustomer() {
		
		Customer temp = customers[0];
		for(int i = 0; i < customers.length; i++) {
			if(Integer.parseInt(customers[i].getcDob()) > Integer.parseInt(temp.getcDob())) {
				temp = customers[i];
			}
		}
		System.out.println("Customer ID: " + temp.getCld());
		System.out.println("Customer Name: " + temp.getcName());
		System.out.println("Customer Email: " + temp.getcEmail());
		System.out.println("Customer Date of Birth: " + temp.getcDob());
	}
	
	private void validateMandatoryField(Customer c) {
		
		if(c == null) {
			throw new MandatoryFieldException("Null Customer Object");
		}else if(c.getCld()==null) {
			throw new MandatoryFieldException("Customer ID cannot be blank");
		}else if(c.getcName()==null) {
			throw new MandatoryFieldException("Customer name cannot be blank");
		}else if(c.getcEmail()==null) {
			throw new MandatoryFieldException("Customer email cannot be blank");
		}else if(c.getcDob()==null) {
			throw new MandatoryFieldException("Customer Date of Birth cannot be blank");
		}
		/*
		 * DOB validation should be stricter by parsing values individually
		 * but choose to stick with violent parse for now for keeping code clean
		 * and further implementatoin
		 */
		
		else if(c.getcDob().length() != 8 || !isValidDOB(c.getcDob())) {
			throw new MandatoryFieldException("Date of Birth must be yyyymmdd numeric format");
		}
	}
	
	private boolean isValidDOB(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.getNumericValue(s.charAt(i)) < 0 && Character.getNumericValue(s.charAt(i)) > 9)
				return false;
		}
		return true;
	}

}
