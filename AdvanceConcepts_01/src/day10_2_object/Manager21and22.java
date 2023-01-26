/**
 * 
 */
package day10_2_object;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Manager21and22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person21 p1 = new Person21("ABC", 10);
		System.out.println(p1);					//it will print hexadecimal representation of memeory address
		Person22 p2 = new Person22("ABC", 10);
		System.out.println(p2);
		System.out.println(p2.toString());
	}

}


class Person21{
	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person21(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}

class Person22{
	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person22(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person22 [name=" + name + ", age=" + age + "]";
	}
	
	
	
}