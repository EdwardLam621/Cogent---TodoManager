/**
 * 
 */
package q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class StudentDAO {
	
	Map<String, Student> names = new HashMap<String, Student>();
	
	Scanner sc = new Scanner(System.in);
	
	
	public void addStudent() {
		System.out.println("Name: ");
		String n = sc.next();
		System.out.println("Age: ");
		int a = sc.nextInt();
		System.out.println("Address: ");
		String ad = sc.next();
		System.out.println("ID: ");
		String sid = sc.next();
		names.put(sid, new Student(n, ad, sid, a));
	}
	
	public void printNames() {
		Set<String> keySet = names.keySet();
		for(String i: keySet) {
			Student s = names.get(i);
			System.out.println("Name: " + s.getName());
//			System.out.println("Age: " + s.getAge());
//			System.out.println("Student ID " + s.getSID());
//			System.out.println("Address: " + s.getAddress());
		}
	}
	
	public void getName(String key) {
		
		if(names.containsKey(key)) {
			Student s = names.get(key);
			System.out.println("Name: " + s.getName() + "\nSID : " + s.getSID() + "\nAddress: " + s.getAddress() + "\nAge: " + s.getAge());
		} else {
			System.out.println("Student does not exists");
		}
		
	}
	
	public void printSize() {
		System.out.println("Map size: " + names.size());
	}
	
	public void removeName(String key) {
		if(names.containsKey(key)) {
			names.remove(key);
			System.out.println(key + " removed");
		} else {
			System.out.println("Student does not exists");
		}		
	}
}
