/**
 * 
 */
package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Sample5 {
	
	
	public static void main(String[] args) {
		List<Product> l = new ArrayList<>();
		
		l.add(new Product(1, "abc", 100));
		l.add(new Product(2, "abd", 1500));
		l.add(new Product(3, "abe", 90100));
		l.add(new Product(4, "abf", 1005));
		l.add(new Product(5, "abg", 30000));
		
		l.stream()
			.filter(p -> p.price >= 30000)
			.map(pm -> pm.price)
			.forEach(System.out::println);
		
	}
	
	
	
	
	
}

class Product{
	int id;
	String name;
	int price;
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}