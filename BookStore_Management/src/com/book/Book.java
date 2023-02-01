/**
 * 
 */
package com.book;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class Book {

	private String bookID, title, author, category;
	private float price;
	/**
	 * @param bookID
	 * @param title
	 * @param author
	 * @param category
	 * @param price
	 * @throws InvalidBookException 
	 */
	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException {
		
		if(title.length() < 4 || price < 0) {
			throw new InvalidBookException();
		} else if (!category.equals("Fiction") &&
				!category.equals("Science") &&
				!category.equals("Technology") &&
				!category.equals("Others"))
		{
			throw new InvalidBookException();
		}
		else {
			this.bookID = bookID;
			this.title = title;
			this.author = author;
			this.category = category;
			this.price = price;
		}
		
	}
	/**
	 * @return the bookID
	 */
	public String getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
	
}
