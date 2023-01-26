/**
 * 
 */
package Day10_App01_Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class ExtraExercise {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String path = "C:/Users/edward/Desktop/CogentU/cogent.txt";
		
		System.out.printf("Size: %d words\n", Files.size(Paths.get(path)));

	}

}
