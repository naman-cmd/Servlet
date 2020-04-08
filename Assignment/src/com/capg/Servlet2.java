package com.capg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) {  
	    try{  
	
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    int pin = Integer.parseInt(request.getParameter("pincode"));
	    String tech=request.getParameter("technology");  
	    out.print("Hello "+ pin +tech);  
	
	    Map<Integer, String> a= new HashMap<Integer,String>();
	    a.put(201306, "Noida");
	    a.put(201012, "Ghaziabad");
	    
	    if(a.containsKey(pin)) {
	    	out.print("City = "+a.get(pin));
	    	out.print("Jobs = Java Developer and Jobs available = "+tech+" Developer.");
	    }
	    
	    out.close();  
	
        }catch(Exception e){System.out.println(e);}  
	}  
}
