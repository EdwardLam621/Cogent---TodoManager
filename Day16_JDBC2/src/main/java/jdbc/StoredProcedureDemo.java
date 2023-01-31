/**
 * 
 */
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
public class StoredProcedureDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Connection connection = JDBCUtils.getConnection();
		String SQL = "{call GetAllProducts()}";
		CallableStatement cstmt;
		try {
			cstmt = connection.prepareCall(SQL);
			ResultSet rs = cstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("ID"));
				System.out.println(rs.getString("Name"));
				System.out.println(rs.getInt("Salary"));
			}
			rs.close();
			cstmt.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
