/**
 * 
 */
package q2;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class TestHashMap {
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
		
		System.out.println("Enter Student ID to search a student:");
		String sid = sc.next();
		sDAO.getName(sid);
		
		
		sDAO.printSize();
		
		System.out.println("Enter Student ID to remove a student:");
		sid = sc.next();
		sDAO.removeName(sid);
		
		//verify the student is removed
		
		sDAO.printSize();
	}
}
