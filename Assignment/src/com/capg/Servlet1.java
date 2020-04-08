package com.capg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        int pin=Integer.parseInt(request.getParameter("pincode"));
        String tech = request.getParameter("technology");
        
        out.print("Welcome "+pin);
        out.println(tech);
  
        out.print("<a href='Servlet2?pincode="+pin+"&technology="+tech+"'>visit</a>");  
                  
        out.close();  
  
        }catch(Exception e){System.out.println(e);}  
    }  
}
