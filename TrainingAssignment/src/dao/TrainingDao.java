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
	public static ArrayList<TrainingBean> getRecords(){  
        ArrayList<TrainingBean> list=new ArrayList<TrainingBean>();  
        try{  
            Connection con=getConnection();  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from Training");  
            while(rs.next()){  
            	TrainingBean tb=new TrainingBean();  
                tb.setId(rs.getInt(1));  
                tb.setName(rs.getString(2));  
                tb.setSeats(rs.getInt(3));  
                list.add(tb);  
            }  
            con.close();  
        }catch(Exception e){System.out.println(e);}  
        return list;  
    }  
}
