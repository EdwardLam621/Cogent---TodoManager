/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author : Edward Lam
 * @date   : 2023-01-31
 */
public class ResultSetMetaDataSample {
	
	private static String QUERY = "select * from employee";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try  {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total columns: " + rsmd.getColumnCount());
			System.out.println("Column name of 1st column: " + rsmd.getColumnName(1));
			System.out.println("Column type of 1st column: " + rsmd.getColumnTypeName(1));
			
			connection.close();
			rs.close();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
