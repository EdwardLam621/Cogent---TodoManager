/**
 * 
 */
package streams;

import java.util.stream.Stream;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stream<Part> partStream = Stream.of(
				new Part("Pencil", 100, 15, 15, 100),
				new Part("Key", 150, 105, 145, 150),
				new Part("Eraser", 1100, 5, 115, 4500),
				new Part("Mob", 10, 15000, 1, 5000)
				);

		partStream.forEach((p) -> System.out.println(p));
	}

}
