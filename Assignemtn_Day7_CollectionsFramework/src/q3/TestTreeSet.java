/**
 * 
 */
package q3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class TestTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		//Add product name
		set.add("Mcdonalds");
		set.add("BurgerKing");
		set.add("Tacobell");
		set.add("KFC");
		set.add("Chickfila");
		set.add("Dicks");
		set.add("Apple Bee");
		
		//duplicate names
		set.add("KFC");
		set.add("Chickfila");
		set.add("Tacobell");
		
		//print products using iterator
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//print first product
		System.out.println("First: " + set.first());
		
		//print last product
		System.out.println("Last:" + set.last());
		
		//print set size
		System.out.println("Set size: " + set.size());
		
		//remove particular product
		System.out.println("Before removal:" + set);
		set.remove("Chickfila");
		System.out.println("After removal:" + set);
		
		//print set size
		System.out.println("Set size: " + set.size());
	}

}
