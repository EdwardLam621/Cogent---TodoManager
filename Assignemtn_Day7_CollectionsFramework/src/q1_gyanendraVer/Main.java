/**
 * 
 */
package q1_gyanendraVer;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentDAO sDAO = new StudentDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 0 to exit student input");
		String in = "";
		while(!in.equals("0")) {
			sDAO.addStudent();
			System.out.println("Next available?");
			in = sc.next();
		}
		sDAO.printNames();
		sDAO.searchName();
		sDAO.searchIndex();
		sDAO.removeName();
	}

}
