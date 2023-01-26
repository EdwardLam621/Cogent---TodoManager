/**
 * 
 */
package com.hp;



/**
 * @author : Edward Lam
 * @date   : 2023-01-14
 */
public class Y {
	X x1 = new X();
	
	// public -> default
	{
		//not accessible for p because it is private
		//System.out.println(x1.p);
		
		System.out.println(x1.getQ());
		
		System.out.println(x1.q);
		System.out.println(x1.r);
		System.out.println(x1.s);
	}
}
