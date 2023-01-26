/**
 * 
 */
package Day10_App01_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Application03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream(new File("C:/Users/edward/Desktop/CogentU/myfile.txt"));
			fos = new FileOutputStream("C:/Users/edward/Desktop/CogentU/mynewfile.txt");
			System.out.println("File opened");
			
			int data;
			
			while((data = fis.read()) != -1) {
				
				fos.write(data);
				
			}
			System.out.println("File Copied");
			
			
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
