/**
 * 
 */
package com.cogent.day08.abstractinterface;

import java.util.ArrayList;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Day07WrapperClasses {

	public static void main(String[] args) {
		int x = 100;
		Integer age = Integer.valueOf(x);	//boxing
		//Integer age2 = new Integer(x);	//rarely appropriate to directly use constructor when wrapping primitive data types
		
		int y = age.intValue();				//unboxing

		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(age);
		arr.add(x);							//when putting primitive data type (int) into ArrayList, 
		arr.add(y);							//it is automatically converted from primitive type int 
		arr.add(88);						//to wrapped Integer class

		for(Integer i : arr) {
			System.out.println(i);
		}
	}
	
}
