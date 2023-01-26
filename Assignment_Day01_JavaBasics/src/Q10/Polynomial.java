/**
 * 
 */
package Q10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Polynomial {
	
	private int arraySize = 3;
	int currentIndex;
	private Term[] arr;
	Map<Integer, Integer> map;
	
	Polynomial() {
		map  = new HashMap<>();
		currentIndex = 0;
		arr = new Term[arraySize];
		for(int i = 0; i < arraySize; i++) {
			arr[i] = new Term();
			arr[i].setCoefficient(0);
			arr[i].setExponent(0);
		}
	}
	
	
	public boolean setTerm(int c, int e) {
		
		//exponent smaller than 0
		if(e < 0) {
			System.out.println("Exponent cannot be negative.");
			return false;
		}
		
		// exponent is used
		else if (map.containsKey(e)){
			System.out.println("Exponent " + e + " cannot be duplicated.");
			return false;
		}
		
		else if(currentIndex == arraySize) {
			System.out.println("Array size exceed: " + arraySize + " -- Term " + 
						c + "x^" + e + " will not be stored.");
			return true;
		}
		// good to go
		else {
			arr[currentIndex].setCoefficient(c);
			arr[currentIndex].setExponent(e);
			map.put(e, 1);
			currentIndex++;
		}
		
		return false;
			
	}
	
	public void sort() {
		Arrays.sort(arr, (a,b) -> b.getExponent() - a.getExponent());
	}
	
	public String toString(){
		String s = "Polynomial: ";
		sort();
		for(int i = 0; i < arraySize; i++) {
			s += arr[i].getCoefficient() + "x^" + arr[i].getExponent();
			if(i < arraySize - 1) {
				s += " + ";
			}
		}
		
		return s;
	}
	
	public void print() {
		System.out.println(toString());
	}
}
