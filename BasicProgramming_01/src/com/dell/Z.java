/**
 * 
 */
package com.dell;

import com.hp.*;

/**
 * @author : Edward Lam
 * @date   : 2023-01-14
 */
public class Z extends X{
	{
		//public to protect
		// p & q are not accessible because they are either private or default
		//System.out.println(p);
		//System.out.println(q);
		
		System.out.println(getP());
		System.out.println(getQ());
		
		System.out.println(r);
		System.out.println(s);
	}
	
}
