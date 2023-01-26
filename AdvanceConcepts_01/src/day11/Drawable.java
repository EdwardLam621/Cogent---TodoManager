/**
 * 
 */
package day11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-21
 */
public interface Drawable {

	default void draw() {
		System.out.println("Drawable interface's draw method");
	}
	
	default void drawInQuotes() {
		System.out.println("\" The Drawable interface's drawInQuotes method\"");
	}
	
	public abstract boolean hasBeenDrawn();
}
