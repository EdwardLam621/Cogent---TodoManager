/**
 * 
 */
package Day10_App01_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Application01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(new File("C:/Users/edward/Desktop/CogentU/myfile.txt"));
			System.out.println("File opened");
			
			int i;
			
			while((i = fis.read()) != -1) {
				
				System.out.print((char)i);
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				
				fis.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
		

	}

}
