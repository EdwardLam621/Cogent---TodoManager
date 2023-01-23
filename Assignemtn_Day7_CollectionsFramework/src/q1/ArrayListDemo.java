/**
 * 
 */
package q1;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		//setNames
		System.out.println("SetNames executing");
		s.setNames();
		System.out.println("SetNames executed\n");
		
		//printNames
		System.out.println("printNames executing");
		s.printNames();
		System.out.println("printNames executed\n");
		
		//searchName
		System.out.println("searchNames executing");
		//System.out.print("name at index 1: ");	//hardcode
		//s.searchName(1);
		System.out.println("Enter the index");
		s.searchName(sc.nextInt());
		System.out.println("searchNames executed\n");
		
		
		//removeName
		System.out.println("removeName executing");
//		System.out.println("Before removal:");
//		s.printNames();
//		System.out.println("Removing BBB");
//		s.removeName("BBB");
//		System.out.println("After removal:");
//		s.printNames();
		
		
		
		System.out.println("removeName executed\n");
	}

}
