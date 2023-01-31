/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author : Edward Lam
 * @date   : 2023-01-30
 */
public class SelectPSStatement {
	
	private static String QUERY = "select * from employee";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try  {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Employee ID is: " + rs.getInt("ID"));
				System.out.println("Employee name is: " + rs.getString("NAME"));
				System.out.println("Employee salary is: " + rs.getInt("SALARY"));
			}
			connection.close();
			rs.close();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
