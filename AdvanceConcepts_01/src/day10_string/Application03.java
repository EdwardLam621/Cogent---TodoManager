/**
 * 
 */
package day10_string;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Application03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String pool
		
		String s1 = "abc",
				s2 = "xyz",
				s3 = "abc",
				s4 = new String("abc"),
				s5 = new String("abc");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//these lines will return true because s1 and s3 
		//are directing the same string value "abc" in the string pool
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1 == s4);  //false because s4 called a new object operator, which turns
										//s4 stored as a new string object in string pool;
		System.out.println(s4 == s5);
	}

}
