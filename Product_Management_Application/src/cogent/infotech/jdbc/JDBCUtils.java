/**
 * 
 */
package cogent.infotech.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Edward Lam
 * @date   : 2023-01-28
 */
public class JDBCUtils {
	
	public static String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_demos";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "Apple12345678";
	
	public static Connection getConnection(){
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return con;

	}

}
