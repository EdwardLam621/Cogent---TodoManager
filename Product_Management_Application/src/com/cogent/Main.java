/**
 * 
 */
package com.cogent;

import java.util.Scanner;

import cogent.infotech.controller.ProductController;

/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ProductController pc = new ProductController();
		int choice = 0;
		
		do {
			System.out.println("1 - Add");
			System.out.println("2 - Display");
			System.out.println("3 - Update");
			System.out.println("4 - Delete");
			System.out.println("5 - Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Product ID");
				int pId = sc.nextInt();
				System.out.println("Product Name");
				String pName = sc.next();
				System.out.println("Product Catagory");
				String pCat = sc.next();
				System.out.println("Manufacture date");
				String manufactureDate = sc.next();
				System.out.println("Expiry Date");
				String expiry_date = sc.next();
				System.out.println("Price");
				double price = sc.nextDouble();
				pc.create(pId, pName, pCat, manufactureDate, expiry_date, price);
				break;
			case 2:
				int case2choice = 0;
				do {
					System.out.println("1- Find cheapest product in a catagory");
					System.out.println("2- Find product by catagory");
					System.out.println("3- Find expired product");
					System.out.println("4- Exit");
					case2choice = sc.nextInt();
					switch(case2choice) {
					case 1:
						System.out.println("Enter category you are looking for:");
						pCat = sc.next();
						pc.read(pCat,1);
						break;
					case 2: 
						System.out.println("Enter category you are looking for:");
						pCat = sc.next();
						pc.read(pCat,2);
						break;
					case 3:
						System.out.println("Enter a yyyymmdd format date to verify expired products");
						String dateToVerify = sc.next();
						pc.read(dateToVerify, 3);
						break;
					}
				} while(case2choice != 4);
				break;
				
				
				
			case 3:
				System.out.println("Product ID");
				pId = sc.nextInt();
				System.out.println("NEW Product Name");
				pName = sc.next();
				System.out.println("NEW Product Catagory");
				pCat = sc.next();
				System.out.println("NEW Manufacture date");
				manufactureDate = sc.next();
				System.out.println("NEW Expiry Date");
				expiry_date = sc.next();
				System.out.println("NEW Price");
				price = sc.nextDouble();
				pc.update(pId, pName, pCat, manufactureDate, expiry_date, price);
				break;
				
			case 4:
				int case4choice = 0;
				do {
					System.out.println("Want to delete by ID or catagory?");
					System.out.println("1 - ID");
					System.out.println("2 - Catagory");
					System.out.println("3 - Exit");
					case4choice = sc.nextInt();
					switch(case4choice) {
					case 1:
						System.out.println("Product ID");
						pId = sc.nextInt();
						pc.delete(pId);
						break;
					case 2:
						System.out.println("Product Catagory");
						pCat = sc.next();
						pc.delete(pCat);
						break;
					}
				} while(case4choice != 3);
				
				
			}
			
			
		} while(choice != 5);
		
		sc.close();
		
		
		
		
	}
	
}
