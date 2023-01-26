/**
 * 
 */
package day11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-21
 */

enum{pixel,}


public interface Drawable2 implements Shape {
	public default void draw() {
		System.out.println("Te Drawable interface's draw method");
	}
	
	public static Unit getStandardUnit() {
		return Unit.pixed;
		
	}
	
	
}
