package basicJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sahil {

	public static void main(String[] args) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		
	}
	
}
