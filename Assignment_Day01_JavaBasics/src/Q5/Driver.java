/**
 * 
 */
package Q5;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee();									//all by default
		Employee e2 = new Employee(1, "Apple", new Date(31,13,1999));	//invalid month 
		Employee e3 = new Employee(2, "Bee", new Date(-1, 10, 1999));	//invalid day
		Employee e4 = new Employee(3, "Car", new Date(10,10, 1099));	//invalid year
		Employee e5 = new Employee(4, "Duck", new Date(31,12,2022));	//valid date
		Employee e6 = new Employee(5, "Eagle", new Date(18,9,1991));	//valid date
		Employee e7 = new Employee(6, "Fortune", new Date(3,1,2002));	//valid date
		Employee e8 = new Employee(7, "Google", new Date(1,10,1950));	//valid date
		Employee e9 = new Employee(8, "Honda", new Date());				//valid date with default Date class constructor
		
		//print data
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println(e6.toString());
		System.out.println(e7.toString());
		System.out.println(e8.toString());
		System.out.println(e9.toString());
		
	}

}
