/**
 * 
 */
package com.dell;

import com.hp.*;

/**
 * @author : Edward Lam
 * @date   : 2023-01-14
 */
public class T {
	{
		//public only
		X x1 = new X();
		// p, q, r are not accessible because they are either private, default, or protected
		//System.out.println(x1.p);
		//System.out.println(x1.q);
		//System.out.println(x1.r);
		
		System.out.println(x1.getP());
		System.out.println(x1.getQ());
		System.out.println(x1.getR());
		
		System.out.println(x1.s);
	}
}
