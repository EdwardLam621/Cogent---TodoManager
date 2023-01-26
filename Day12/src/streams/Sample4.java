/**
 * 
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// stream of collection
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream stream = list.stream();
		stream.forEach((x) -> System.out.println(x));
		

	}

}
