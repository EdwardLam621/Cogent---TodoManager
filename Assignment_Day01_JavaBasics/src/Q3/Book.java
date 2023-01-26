/**
 * 
 */
package Q3;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Book {
	
	private String bookTitle;
	private double bookPrice;
	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}
	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	/**
	 * @return the bookPrice
	 */
	public double getBookPrice() {
		return bookPrice;
	}
	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public String toString() {
		return String.format("%-30s Rs.%s \n", bookTitle, bookPrice);
	}
}
