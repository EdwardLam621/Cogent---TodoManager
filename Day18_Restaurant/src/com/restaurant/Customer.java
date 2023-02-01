/**
 * 
 */
package com.restaurant;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Customer {

	private String customerName;
	private int customerTableNumber;
	Order order;
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	Order orderingItems() {
		
		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		System.out.println("Enter number of items....");
		order.noOfItems = sc.nextInt();
		int[][] orderToMake = order.items;
		for(int i = 0; i < order.noOfItems;) {
			if(i > order.noOfItems) {
				System.out.println("you have exceed order number, please start over");
				break;
			} else {
				System.out.println("Enter itemsNumbers and their quantity one by one");
				int itemsNumbers = sc.nextInt();
				int quantity = sc.nextInt();
				if(quantity + i > order.noOfItems) {
					System.out.println("you have exceed order number, please start over");
					break;
				}
				orderToMake[itemsNumbers][1] = quantity;
				i+=quantity;
			}
			System.out.println("---------------------------------------");
		}
		order.items = orderToMake;
		
		System.out.println("Order is created, sending to chef");
		sc.close();
		return order;
	}
	
	void eat() {
		System.out.println(this.customerName + " is eating......");
	}
	/**
	 * @param customerName
	 */
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}
	
		
}
