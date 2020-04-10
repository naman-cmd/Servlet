package service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.*;
import dao.*;

public class TrainingService {
	
	public static ArrayList<TrainingBean> getDetails()
	{
		 ArrayList<TrainingBean> list=new ArrayList<TrainingBean>();  
	        try{  
	            Connection con=TrainingDao.getConnection();  
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
