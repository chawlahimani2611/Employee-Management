package employeemanagement;
import java.sql.*;

public class dbconnection {
	static Connection con;
	public static Connection createdbconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employeeDB?allowPublicKeyRetrieval=true&useSSL=false ";
			String username="root";
			String password="2611";
			con=DriverManager.getConnection(url, username, password);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
	

}
