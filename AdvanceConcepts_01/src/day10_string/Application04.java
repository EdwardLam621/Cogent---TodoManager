/**
 * 
 */
package day10_string;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Application04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//StringBuilder practice
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity: " + sb.capacity()); //16 bytes
		
		//StringBuffer is mutable
		sb.append("HELLOdddddddddddddddddddddddddddddddddddd");
		sb.append("WORLDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(sb);
		
		System.out.println(sb.capacity()); //84 bytes, old capacity * 2 + 2
		System.out.println("charAt(10): " + sb.charAt(10)); //charAt
		
		StringBuffer sb1 = new StringBuffer("ABCDE");
		
		System.out.println(sb1.reverse());
		System.out.println(sb1.insert(3, "XYZ"));
		System.out.println(sb1.delete(3, sb1.length())); 
		
		
	}

}
