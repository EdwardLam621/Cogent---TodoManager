/**
 * 
 */
package comparator;

import java.util.Arrays;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Main {

	
	public static void main(String[] args) {
		
		//[ABC, ABCD, ABD, ABDD, ACE, BBC, Z, ZZZZZZZZZ]
		//[Z, BBC, ABC, ABD, ACE, ABCD, ABDD, ZZZZZZZZZ]
		
		String[] names1 = {"BBC","ABC", "ABCD", "ABD", "ABDD", "ACE","Z", "ZZZZZZZZZ"};
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
		
		String[] names2 = {"BBC","ABC", "ABCD", "ABD", "ABDD", "ACE","Z", "ZZZZZZZZZ"};
		Arrays.sort(names2, new StringLengthComparator());
		System.out.println(Arrays.toString(names2));
		
		
		
	}
	
}
