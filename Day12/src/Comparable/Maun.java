/**
 * 
 */
package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Maun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(100,"BBC", "LLL"));
		students.add(new Student(100,"ABC", "LLL"));
		students.add(new Student(101,"ABC", "LLL"));
		students.add(new Student(99999,"ABC", "LLL"));
		students.add(new Student(1,"ABC", "LLL"));

		Collections.sort(students);
		
		System.out.println(students);
		
	}

}
