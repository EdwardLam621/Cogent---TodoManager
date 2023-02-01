/**
 * 
 */
package spring;

import org.springframework.context.annotation.Bean;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class ProductBean {

	@Bean (name = "product")
	public Product getProduct() {
		Product p = new Product();
		p.setProductID(1001);
		p.setProductName("IPHONE");
		p.setProductPrice(20.5);
		return p;
	}
}
