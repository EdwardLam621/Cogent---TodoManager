/**
 * 
 */
package com.model;

import org.springframework.stereotype.Component;

/**
 * @author : Edward Lam
 * @date   : 2023-02-03
 */

@Component("fooFormatter")
public class FooFormatter implements Formatter{

	public String format() {
		// TODO Auto-generated method stub
		return "FOO";
	}

}
