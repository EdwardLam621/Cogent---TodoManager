/**
 * 
 */
package com.cogent.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class MandatoryFieldException extends RuntimeException{
	private String errorMSG;

	/**
	 * @param errorMSG
	 */
	public MandatoryFieldException(String errorMSG) {
		
		super();
		this.errorMSG = errorMSG;
	}
	
	
}
