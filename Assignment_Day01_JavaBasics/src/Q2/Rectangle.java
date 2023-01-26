/**
 * 
 */
package Q2;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Rectangle {
	
	private double length, breadth;

	/**
	 * 
	 */
	public Rectangle() {
		super();
		length = 0;
		breadth = 0;
	}

	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return breadth;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.breadth = width;
	}
	
	public double getArea() {
		return Math.abs(breadth * length);
	}
	
//	public double getCircumference() {
//		return (breadth + length) * 2;
//	}
	
	public String toString() {
		return "Rectangle Breadth: " + this.breadth + "\n" +
				"Rectangle Length: " + this.length + "\n" +
				"Rectangle Area: " + this.getArea() + "\n";
	}
	
}
