/**
 * 
 */
package q1;

/**
 * @author : Edward Lam
 * @date   : 2023-01-24
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student s = new Student();
		
		//setNames
		System.out.println("SetNames executing");
		s.setNames();
		System.out.println("SetNames execute\n");
		
		//printNames
		System.out.println("printNames executing");
		s.printNames();
		System.out.println("printNames executed\n");
		
		//searchName
		System.out.println("searchNames executing");
		System.out.print("name at index 1: ");
		s.searchName(1);
		System.out.println("searchNames executed\n");
		
		
		//removeName
		System.out.println("removeName executing");
		System.out.println("Before removal:");
		s.printNames();
		System.out.println("Removing BBB");
		s.removeName("BBB");
		System.out.println("After removal:");
		s.printNames();
		System.out.println("removeName executed\n");
	}

}
