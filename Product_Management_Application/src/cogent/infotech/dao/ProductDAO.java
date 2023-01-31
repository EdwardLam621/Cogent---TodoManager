/**
 * 
 */
package cogent.infotech.dao;

/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
interface ProductDAO {

	// manufactureDate needs to be optimized as Date object
	public void addProduct(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date, double price);
	
	public void deleteProductById(int pid);
	
	public void deleteProductByCat(String pCat);
	
	public void findCheapestProductInCat(String pCat);
	
	public void findProductByCat(String pCat);
	
	public void updateProduct(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date, double price);
	
	public void findExpiredProducts(long price_expiry_date);
	
}
