/**
 * 
 */
package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("John", 40);	
		map.put("ABC", 30);
		map.put("JJJ", 1200);
		
		Set<String> keySet = map.keySet();
		
		System.out.println("Keys are:" + keySet);
		
		Collection<Integer> value = map.values();
		System.out.println("Values are:" + value);
		
		for(String k : keySet) {
			System.out.println(k + " " + map.get(k));
		}
	}
	
	
}
