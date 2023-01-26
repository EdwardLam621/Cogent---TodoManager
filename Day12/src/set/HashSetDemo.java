/**
 * 
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		//array list
//		Random obj = new Random();
//		List<Integer> list = new ArrayList<>();
//		for(int i = 0; i < 10; i ++) {
//			int num = obj.nextInt(5);
//			list.add(num);
//		}
//		System.out.println("List is" + list);
//		
//		//parsing created list in set
//		Set<Integer> set1 = new HashSet<>(list);
//		for(Integer i:list) {
//			set1.add(i);
//		}
//		System.out.println(set1);
//		
//		
		
		Random obj = new Random();
		
		Set<Integer> set2 = new TreeSet<>();
		
		for (int i = 0 ; i < 5; i++) {
			int num = obj.nextInt(5);
			set2.add(num);
			System.out.println(num);
		}
		
		System.out.println(set2);
		
		Iterator<Integer> itr = set2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	

}
