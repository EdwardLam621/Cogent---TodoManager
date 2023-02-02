/**
 * 
 */
package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : Edward Lam
 * @date   : 2023-02-03
 */

@Component
public class FooService {
	
	@Autowired
	//@Qualifier("barFormatter")    //without Quflifier it will cause conflicts 
									//because there are two classes implemented from the inteface
	private Formatter formatter;
	
	public String message() {
		return formatter.format();
	}
}
