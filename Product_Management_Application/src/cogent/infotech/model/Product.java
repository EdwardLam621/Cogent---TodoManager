/**
 * 
 */
package cogent.infotech.model;

/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
public class Product {
	private int pid;
	private String pName, pCat, manufactureDate, price_expiry_date;
	private double pPrice;
	/**
	 * @param pid
	 * @param pName
	 * @param pCat
	 * @param manufactureDate
	 * @param price_expiry_date
	 * @param pPrice
	 */
	public Product(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date,
			double pPrice) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pCat = pCat;
		this.manufactureDate = manufactureDate;
		this.price_expiry_date = price_expiry_date;
		this.pPrice = pPrice;
	}
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}
	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	/**
	 * @return the pCat
	 */
	public String getpCat() {
		return pCat;
	}
	/**
	 * @param pCat the pCat to set
	 */
	public void setpCat(String pCat) {
		this.pCat = pCat;
	}
	/**
	 * @return the manufactureDate
	 */
	public String getManufactureDate() {
		return manufactureDate;
	}
	/**
	 * @param manufactureDate the manufactureDate to set
	 */
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	/**
	 * @return the price_expiry_date
	 */
	public String getPrice_expiry_date() {
		return price_expiry_date;
	}
	/**
	 * @param price_expiry_date the price_expiry_date to set
	 */
	public void setPrice_expiry_date(String price_expiry_date) {
		this.price_expiry_date = price_expiry_date;
	}
	/**
	 * @return the pPrice
	 */
	public double getpPrice() {
		return pPrice;
	}
	/**
	 * @param pPrice the pPrice to set
	 */
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	
	
}
