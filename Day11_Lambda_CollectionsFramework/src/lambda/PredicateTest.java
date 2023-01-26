/**
 * 
 */
package lambda;

import java.util.function.Predicate;

/**
 * @author : Edward Lam
 * @date   : 2023-01-23
 */
public class PredicateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating predicate
        Predicate<Integer> greaterAndEqualThan = i -> (i >= 20); 
  
        // Calling Predicate method
        System.out.println(greaterAndEqualThan.test(10)); 
        System.out.println(greaterAndEqualThan.test(20)); 
        System.out.println(greaterAndEqualThan.test(22)); 
       

	}

}
