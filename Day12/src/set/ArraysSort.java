/**
 * 
 */
package set;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class ArraysSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int a[] = {18,49,2,1,77,2018};
		
		System.out.println("Before");
		for(int i: a) {
			System.out.println(i);
		}
		
		
		Arrays.sort(a);
		
		System.out.println("After");
		for(int i : a) {
			System.out.println(i);
		}
		
		String s[] = {"A","BAB","OOOO","A","KKDO","KKK", "KKKA"};
		Arrays.sort(s);
		
		for(String str : s) {
			System.out.println(str);
		}
		
		List<String> list = Arrays.asList(s);
		
		System.out.println(list);
	}

}
