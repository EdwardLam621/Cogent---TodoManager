/**
 * 
 */
package cogent.infotech.controller;

import cogent.infotech.dao.ProductDAOImpl;

/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
public class ProductController {

	ProductDAOImpl dao = new ProductDAOImpl();
	
	public void create(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date, double product_price ) {
		dao.addProduct(pid, pName, pCat, manufactureDate, price_expiry_date, product_price);
	}
	
	public void read(String dataToParse, int operation) {
		switch(operation) {
		case 1:
			dao.findCheapestProductInCat(dataToParse);
			break;
		case 2:
			dao.findProductByCat(dataToParse);
			break;
		case 3:
			dao.findExpiredProducts(Long.parseLong(dataToParse));
			break;
		}
		
	}
	
	public void update(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date, double product_price) {
		dao.updateProduct(pid, pName, pCat, manufactureDate, price_expiry_date, product_price);
	}
	
	public void delete(int pid) {
		dao.deleteProductById(pid);
	}
	
	public void delete(String pCat) {
		dao.deleteProductByCat(pCat);
	}
}
