/**
 * 
 */
package com.cogent.controller;

import java.util.Scanner;

import com.cogent.service.CustomerService;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class CustomerController {
	
	CustomerService cs;
	Scanner sc = new Scanner(System.in);
	/**
	 * @param cs
	 */
	public CustomerController() {
		
		cs = new CustomerService();
		
	}



	public void accept(int choice) {
		
		String cid;
		
		switch(choice) {
		case 1:
			cs.save();
			break;
		case 2:
			cs.fetch();
			break;
		case 3:
			System.out.println("Please enter customer ID");
			cid = sc.next();
			cs.modify(cid);
			break;
		case 4:
			System.out.println("Please enter customer ID");
			cid = sc.next();
			cs.delete(cid);
			break;
		case 5:
			cs.fetchYoungest();
			break;
		case 6:
			System.out.println("Please enter customer ID");
			cid = sc.next();
			cs.fetchByID(cid);
			break;
		case 7:			
			System.exit(0);
			
		}
	}
}
