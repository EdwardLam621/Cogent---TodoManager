/**
 * 
 */
package Q4;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Rectangle {
	
	private double length, width;

	/**
	 * 
	 */
	public Rectangle() {
		super();
		length = 0;
		width = 0;
	}

	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.width = breadth;
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
		if(length > 0 && length < 20)
			this.length = length;
		else System.out.println("Only accept value from more than 0.0 to less than 20.0");
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if(width > 0 && width < 20)
			this.width = width;
		else System.out.println("Only accept value from more than 0.0 to less than 20.0");
	}
	
	public double getArea() {
		return Math.abs(width * length);
	}
	
//	public double getCircumference() {
//		return (breadth + length) * 2;
//	}
	
	public String toString() {
		return "Rectangle Breadth: " + this.width + "\n" +
				"Rectangle Length: " + this.length + "\n" +
				"Rectangle Area: " + this.getArea() + "\n";
	}
	
}
