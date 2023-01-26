/**
 * 
 */
package comparator;

import java.util.Comparator;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()) {
			return -1;
		}
		else if(o1.length() == o2.length()) {
			return 0;
		}
		else return 1;
	}

}
