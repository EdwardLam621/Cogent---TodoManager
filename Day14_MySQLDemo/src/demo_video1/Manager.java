/**
 * 
 */
package demo_video1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Edward Lam
 * @date   : 2023-01-27
 */
public class Manager {
	
	public static void main(String[] args) {
		Connection con = null;
		
		// Load the driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username = "root";
		String password = "Apple12345678";
		
		// Establish the connection
		System.out.println("Connection starts");
		try {
			con = DriverManager.getConnection(url, username, password);
			if(con != null) {
				System.out.println("Connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("Connection is closing");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
