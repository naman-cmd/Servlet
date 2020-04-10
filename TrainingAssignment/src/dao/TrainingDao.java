package dao;
import bean.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TrainingDao {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private PreparedStatement ps;
	
	public static Connection getConnection() {
		Connection con =null;
		try{  
 
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			 con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","naman","naman");   
			    
			  
			}catch(Exception e){
				System.out.println(e);
				
			}  
		return con;
		}
	
}
