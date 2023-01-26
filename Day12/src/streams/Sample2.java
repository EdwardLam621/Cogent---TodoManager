/**
 * 
 */
package streams;

import java.util.stream.Stream;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Stream<String> ss = Stream.of("drop the sword here".split(" "));
		
		ss.forEach((s) -> System.out.println(s));
		
		// if execute for once again it will point to IllegalStateException
		// because all elements has been popped out
		ss.forEach((s) -> System.out.println(s));
		
		

	}

}
