/**
 * 
 */
package cogent.infotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cogent.infotech.jdbc.JDBCUtils;

/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
public class ProductDAOImpl implements ProductDAO{

	
	
	@Override
	public void addProduct(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date, double product_price) {
		
		try {
			Connection connection = JDBCUtils.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO product" +
					" (product_id, product_name, product_category, product_manufacture_date, product_expiry_date, product_price) VALUES" + 
					"(?,?,?,?,?,?);");
			
			pstmt.setInt(1, pid);
			pstmt.setString(2, pName);
			pstmt.setString(3, pCat);
			pstmt.setString(4, manufactureDate);
			pstmt.setString(5, price_expiry_date);
			pstmt.setDouble(6, product_price);
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("New record created");
			} else {
				System.out.println("Failed");
			}
			
			connection.close();
			pstmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		
	}



	@Override
	public void deleteProductById(int pid) {
		try {
			Connection connection = JDBCUtils.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement(
				
					"DELETE FROM product WHERE product_id = (?);"
					
					);
			
			pstmt.setInt(1, pid);
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("ID " + pid + " has been removed");
			} else {
				System.out.println("Failed");
			}
			
			connection.close();
			pstmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}



	@Override
	public void deleteProductByCat(String pCat) {
		try {
			Connection connection = JDBCUtils.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement(
				
					"DELETE FROM product WHERE product_category = (?);"
					
					);
			
			pstmt.setString(1, pCat);
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("Category " + pCat + " has been removed");
			} else {
				System.out.println("Failed");
			}
			
			connection.close();
			pstmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		
	}



	@Override
	public void findCheapestProductInCat(String pCat) {
		try {
			Connection connection = JDBCUtils.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement("select * from product where product_category = ? order by product_price asc limit 1;");
			pstmt.setString(1, pCat);
			
			ResultSet rs = pstmt.executeQuery();

			
			while(rs.next()) {

				System.out.printf("ID:%4d Name: %-10s Category: %-10s, Manufacture Date: %-10s Expire: %-10s Cost: %-10f\n", 
						rs.getInt("product_id"), rs.getString("product_name"), rs.getString("product_category"), 
						rs.getString("product_manufacture_date"),rs.getString("product_expiry_date"), rs.getDouble("product_price"));
			}
			

		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
			
			
		
	}



	@Override
	public void findProductByCat(String pCat) {
		try {
			Connection connection = JDBCUtils.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement("select * from product where product_category = ?;");
			pstmt.setString(1, pCat);
			
			ResultSet rs = pstmt.executeQuery();

			
			while(rs.next()) {

				System.out.printf("ID:%4d Name: %-10s Category: %-10s, Manufacture Date: %-10s Expire: %-10s Cost: %-10f\n", 
						rs.getInt("product_id"), rs.getString("product_name"), rs.getString("product_category"), 
						rs.getString("product_manufacture_date"),rs.getString("product_expiry_date"), rs.getDouble("product_price"));
			}
			

		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}



	@Override
	public void updateProduct(int pid, String pName, String pCat, String manufactureDate, String price_expiry_date, double product_price) {
		try  {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement("update product set product_id = ?,"
					+ "product_name = ?, product_category = ?, product_manufacture_date = ?, product_expiry_date = ?, product_price = ?  where product_id = ?;");
			
			ps.setInt(1, pid);
			ps.setString(2, pName);
			ps.setString(3, pCat);
			ps.setString(4, manufactureDate);
			ps.setString(5, price_expiry_date);
			ps.setDouble(6, product_price);
			ps.setDouble(7, pid);
			
			int count = ps.executeUpdate();
			
			if(count > 0) {
				System.out.println("ID " + pid + " has been updated");
			} else {
				System.out.println("Failed");
			}
			
			connection.close();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	@Override
	public void findExpiredProducts(long price_expiry_date) {
		try {
			Connection connection = JDBCUtils.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement("select * from product where product_expiry_date < ?;");
			pstmt.setLong(1, price_expiry_date);
			
			ResultSet rs = pstmt.executeQuery();

			
			while(rs.next()) {
				
				System.out.printf("ID:%4d Name: %-10s Category: %-10s, Manufacture Date: %-10s Expire: %-10s Cost: %-10f\n", 
						rs.getInt("product_id"), rs.getString("product_name"), rs.getString("product_category"), 
						rs.getString("product_manufacture_date"),rs.getString("product_expiry_date"), rs.getDouble("product_price"));
			}
			

		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	

}
