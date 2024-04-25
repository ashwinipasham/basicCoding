package AswiniPractice;
import java.sql.*;

public class JDBC_Connection_Demo {

	static final String  DB_Url = 			
			"jdbc:sqlserver://DESKTOP-V2ON54J//SQLEXPRESS;DatabaseName=BikeStores;IntegratedSecurity=true"; 
	
	static final String query = "select * from production.categories";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open a Connection
	
		try {
		
		Connection conn = DriverManager.getConnection(DB_Url); 
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery(query); 
		
		System.out.println("Connection Established");
		
		//Extract data from query
		while(rs.next()) {
			//retrive by column name
			System.out.println("Id" + rs.getInt("category_id"));
			System.out.println("Category Name" + rs.getString("category_name"));
		}
		}
		catch(Exception e) {
			
			System.out.println("Error connection to database");
			e.printStackTrace();
		}
		
		

	}

}
