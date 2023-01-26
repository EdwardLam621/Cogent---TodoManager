/**
 * 
 */
package lambda;

import java.util.Date;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author : Edward Lam
 * @date   : 2023-01-23
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		MyClass mc = new MyClass();
//		mc.method1();
		
		MyInterface mi = ()-> System.out.println("MyInterface was called");
		mi.method1();
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		Sum s = (x) -> System.out.println(r*r);
		s.multiply(r);
		
		EligibleToVote ev = (x) -> {
			if(x >= 20) {
				System.out.println("Eligible to vote");
			} else {
				System.out.println("Not ligible to vote");
			}
		};
		
		ev.method1(10);
		ev.method1(19);
		ev.method1(20);
		ev.method1(21);
		ev.method1(100);
		
		//functional function
		Function<Double, Double> calculator = (x) -> x * x * 3.14;
		System.out.println(calculator.apply(10.0));
		
		
		//consumer
		Consumer<Integer> consumer = a -> System.out.println(a + " has been accepted");
		consumer.accept(10);
		
		//supplier
		Supplier<Date> supplier =() -> new Date();
		System.out.println(supplier.get());
		
		//upper case
		System.out.println("Input a string");
		String s2 = sc.next();
		System.out.println(s2.toUpperCase());
		
		//functional interface to print reversed string
		System.out.println("Input a string to reverse");
		String s3 = sc.next();
		ReverseString rs = (x) -> {
			for(int i = 0; i < x.length(); i++) {
				System.out.print(x.charAt(x.length() - i - 1));
			}
		};
		rs.reverseString(s3);
		System.out.println();
		
		//method reference
		MethodReferenceInterface mri = (i) -> System.out.println(i);
		mri.method("100");
		
		Main main = new Main();
		MethodReferenceInterface mri_2 = main::myMethodKKKKKKKKKKKKKKKKKK;
		mri_2.method("AAAAAA");
		
		sc.close();

	}
	
	//method for study method reference
	public void myMethodKKKKKKKKKKKKKKKKKK(String i) {
		System.out.println(i);
	}

}
