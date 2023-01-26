/**
 * 
 */
package day11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-21
 */
public class Inheritance implements MyInterface, MyInterface2 {
	
	
	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		i.method1();
	}
	
	
	//when interfaces has method conflicts, override method is required
	//to reslove method conflicts
	@Override
	public void method1() {
		
		System.out.println("Inheritance method1");
	}

}
