/**
 * 
 */
package q4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class StudentSortDemo {
	
	public static void main(String[] args) {
		

		
		ArrayList<Student> names = new ArrayList<Student>();
		
		names.add(new Student("ABC", "ADD1", 1001, 20));
		names.add(new Student("AB2", "ADD2", 10001, 20));
		names.add(new Student("AC2", "ADD4", 101, 20));
		names.add(new Student("Ah2", "ADD12jl", 9, 20));
		names.add(new Student("A", "A", 99999999, 20));
		
		System.out.println("before sort");
		System.out.println(names);
		
		System.out.println("after sort");
		Collections.sort(names);
		System.out.println(names);
	}
	
}
