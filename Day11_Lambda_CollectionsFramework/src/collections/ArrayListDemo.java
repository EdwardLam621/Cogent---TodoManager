/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(new Integer(20)); //Autoboxing
		al.add(50);				// boxing
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i = 10; i < 100; i += 10) {
			al2.add(i);
		}
		System.out.println(al);
		
		al2.add(2,100);
		System.out.println("List after insert" + al2);
		
		al2.set(3,  1000);
		System.out.println("List after replacement" + al2);
		
		
		
		List<Integer> al3 = new ArrayList<Integer>();
		al3.add(111);
		al3.add(222);
		al3.add(333);
		
		System.out.println(al3);
		
		al2.addAll(4,al3);
		System.out.println("First list:" + al);
		
		if(al.contains(222)) {
			System.out.println("Value exists");
		} else {
			System.out.println("Value does not exist");
		}
		
		
		System.out.println("Elements in the list");
			for(int i = 0; i < al2.size(); i++) {
				System.out.println(al2.get(i));
			}
		
		
	}

}
