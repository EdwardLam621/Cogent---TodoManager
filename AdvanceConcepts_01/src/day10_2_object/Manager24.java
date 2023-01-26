/**
 * 
 */
package day10_2_object;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Manager24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A24 a1= new A24(10,20);
		A24 a2= new A24(10,20);
		
		System.out.println(a1==a2);            //compare reference memory address so it is false
		System.out.println(a1.equals(a2)); 

	}

}


class A24{
	int i, j;

	/**
	 * @param i
	 * @param j
	 */
	public A24(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "A24 [i=" + i + ", j=" + j + "]";
	}
	
	public boolean equals(Object obj) {
		
		// Step 1 Check if objects are of same type
		if(obj instanceof A24){
			
			// Step 2 Downcast
			A24 a = (A24) obj;
			
			// Step 3 compare the content
			if((i ==a.i) && (j == a.j)) {
				return true;
			}
		}
				
		return false;
	}
	
}


class Rectangle{
	
	int length, breadth;

	/**
	 * @param length
	 * @param breadth
	 * @param area
	 */
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area= " + length * breadth + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Rectangle) {
			Rectangle a = (Rectangle) o;
			if(a.breadth == this.breadth && a.length ==this.length) {
				return true;
			}
		}
		
		return false;
	}
	
}


class Book{
	
	String title, arthur;
	int page;
	double price;

	
	
	
	/**
	 * @param title
	 * @param arthur
	 * @param page
	 * @param price
	 */
	public Book(String title, String arthur, int page, double price) {
		super();
		this.title = title;
		this.arthur = arthur;
		this.page = page;
		this.price = price;
	}


	
	@Override
	public String toString() {
		return "Book [title=" + title + ", arthur=" + arthur + ", page=" + page + ", price=" + price + "]";
	}



	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Rectangle) {
			Book a = (Book) o;
			if(a.title.equals(this.title) && a.arthur.equals(this.arthur) &&
					a.page == this.page && a.price == this.price) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Book b) {
		if(this.title.equals(b.title)) {
			if(this.arthur.equals(b.arthur)) {
				if(this.page == b.page) {
					if(this.price == b.price) {
						return 0
					}
					else if(this.price > b.price) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		}
		
	}
	
}