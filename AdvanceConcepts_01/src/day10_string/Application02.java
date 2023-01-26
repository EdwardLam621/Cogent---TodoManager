/**
 * 
 */
package day10_string;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Application02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println("Length of String is " + s.length());
		System.out.println("Index of o " + s.indexOf('o'));
		System.out.println("Index  " + s.charAt(1));
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(4,5));
		
		String[] res = s.split(" ");
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		System.out.println("replace k: " + s.replace('l', 'k'));
		System.out.println("Upper case: " + s.toUpperCase());
		System.out.println("lower case: " + s.toLowerCase());
		
		String s1 = "HELLO", s2 = "WORLD";
		
		s2 = s1.concat(s2);
		
		System.out.println("After concat:\n"+ s1 + "\n" + s2);
	}

}
