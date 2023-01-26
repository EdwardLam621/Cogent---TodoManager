/**
 * 
 */
package Day10_App01_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Application05 {
	
	// a program to copy the data from one file to another file using character oriented streams

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:/Users/edward/Desktop/CogentU/myfile.txt");
		fw = new FileWriter("C:/Users/edward/Desktop/CogentU/mynewfile.txt");
		
		int ch;
		
		while((ch = fr.read()) != -1) {
			
			fw.write(ch);
			
		}
		System.out.println("Data copied");
		
		fr.close();
		fw.close();

	}

}
