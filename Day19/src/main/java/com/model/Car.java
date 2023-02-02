/**
 * 
 */
package com.model;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Car {

	String model;
	double price;
	
	public Car() {
		
	}

	/**
	 * @param model
	 * @param price
	 */
	public Car(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
