/**
 * 
 */
package com.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Person {
	
	@Autowired
	Car car;
	
	public Car getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar2(Car car) {
		this.car = car;
	}
	
	

}
