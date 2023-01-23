/**
 * 
 */
package q1_gyanendraVer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class StudentDAO {
	
	ArrayList<Student> names = new ArrayList<Student>();
	
	Scanner sc = new Scanner(System.in);
	
	
	public void addStudent() {
		System.out.println("Name: ");
		String n = sc.next();
		System.out.println("Age: ");
		int a = sc.nextInt();
		System.out.println("Address: ");
		String ad = sc.next();
		System.out.println("ID: ");
		int sid = sc.nextInt();
		names.add(new Student(n, ad, a, sid));
	}
	
	public void printNames() {
		for(Student s: names) {
			System.out.println("Name: " + s.getName());
			System.out.println("Age: " + s.getAge());
			System.out.println("Student ID " + s.getSID());
			System.out.println("Address: " + s.getAddress());
		}
	}
	
	public void searchName() {
		System.out.println("Enter name to search");
		String s = sc.next();
		for(Student st: names) {
			if(st.getName().equals(s)) {
				System.out.println("Student exists");
				break;
			}else {
			System.out.println("Student does not exists");
			}
		}
	}
	
	public void searchIndex() {
		System.out.println("Enter Index to search");
		int index = sc.nextInt();
		Student s = names.get(index);
		System.out.println(s.getName() + " " + s.getAge() + " " + s.getSID() + " " + s.getAge());
	}
	
	public void removeName() {
		System.out.println("Who to be removed?");
		String n = sc.next();
		for(Student s: names) {
			if(s.getName().equals(n)) {
				s = new Student();
				System.out.println("Student " + n + " has been removed");
				break;
			}
		}
		
		System.out.println("Student does not exist");
		
	}
}
