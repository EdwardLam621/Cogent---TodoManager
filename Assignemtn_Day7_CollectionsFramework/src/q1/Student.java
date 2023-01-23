/**
 * 
 */
package q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class Student {
	private ArrayList<String> names;
	Scanner sc = new Scanner(System.in);
	
	public void setNames() {
		names = new ArrayList<String>();
		
		//hardcode for test
		//names.add("AAA");
		//names.add("BBB");
		//names.add("CCC");
		
		System.out.println("Please enter 0 when you finish input");
		
		
		String in = "";
		while(!in.equals("0")){
			System.out.println("Please enter name:");
			in = sc.nextLine();
			names.add(in);
		}
		
		
	}
	
	public void searchName(String name) {
		
		if(name.contains(name)) {
			System.out.println("Student exists");
		} else {
			System.out.println("Student does not exists");
		}
	}
	
	public void searchName(int index) {
		System.out.println(names.get(index));
	}
	
	public void printNames() {
		System.out.println(names);
	}
	
	public void removeName(String stuName) {
		int idx = -1;
		if(names.contains(stuName)) {
			idx = names.indexOf(stuName);
			names.set(idx,"");
			System.out.println("name removed");
		} else {
			System.out.println("name does not exist");
		}
		
	}
}
