/**
 * 
 */
package streams;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Part {

	String name;
	
	int weight, number, price, quantity;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param name
	 * @param weight
	 * @param number
	 * @param price
	 * @param quantity
	 */
	public Part(String name, int weight, int number, int price, int quantity) {
		super();
		this.name = name;
		this.weight = weight;
		this.number = number;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @param name2
	 * @param weight2
	 * @param number2
	 * @param price2
	 * @param quantity2
	 */

	@Override
	public String toString() {
		return "Part [name=" + name + ", weight=" + weight + ", number=" + number + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
