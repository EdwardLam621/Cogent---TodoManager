/**
 * 
 */
package streams;

import java.util.stream.Stream;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Sample1 {
	
	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("alpha", "beta", "gamma", "delta");
		
		stringStream.forEach((s) -> System.out.println(s));
	}

}
