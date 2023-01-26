/**
 * 
 */
package q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Q4 {
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence to write for input:");
		StringTokenizer st = new StringTokenizer(sc.nextLine(), "");
		
		FileWriter fw = null;
		FileReader fr = null;
		
		String path = "C:/Users/edward/Desktop/CogentU/cogent - 複製.txt";
		
		try {
			
			fw = new FileWriter(path);
			
			int ch;
			String s;
			while(st.hasMoreTokens()) {
				s = st.nextToken();
				for(int i = 0; i < s.length(); i++) {
					
					fw.write(s.charAt(i));
					
				}
				fw.write(' ');
			}
			fw.close();
			
			File f = new File(path);
			long size = f.length();
			System.out.printf("Size: %d\n", size);
			System.out.println("Contents of file:");
			
			fr = new FileReader(path);
			while((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println("\n");
			
			if(f.delete()) {
				System.out.println("File deleted");
			} else {
				System.out.println("File deleted error");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
