package registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        String pass2 = request.getParameter("pass2");
        String age = request.getParameter("age");
        int a=Integer.parseInt(age);
        String[] techs = request.getParameterValues("tech1");
        
        String city = request.getParameter("city");
        String gender = request.getParameter("gender");
        String work = request.getParameter("work");
        out.println("hi");
         if(name.length()<3)
        {
        	out.println("<html> <h1> UserName is too small</h1></html>");
        	return;
        }
         
        
        	for(int i=0;i<name.length();i++)
        	{
        		if((name.charAt(i)>64 && name.charAt(i)<92) ||(name.charAt(i)>96 && name.charAt(i)<123) )
        		{
        			
        		}
        		else
        		{
        			out.println("<html> <h1> Wrong UserName</h1></html>");
        			return;
        		}
        	}
        
       
         if(!(pass.equals(pass2)))
        {
        	out.println("<html> <h1> Password not  matched </h1></html>");
        }
        else if(a<18 || a>60)
        {
        	out.println("<html> <h1> Invalid Age </h1></html>");
        }
        
        else
        {
        	out.println("<html>");
        	out.println("<b> UserName------>"+name+"</b> <br>");
        	out.println("<b> Password------>"+pass+"</b><br>");
        	out.println("<b> Age------>"+age+"</b><br>");
        	out.println("<b> Gender------>"+gender+"</b><br>");
        	out.println("<b> City------>"+city+"</b><br>");
        	out.println("<h3> Technologies Known"+"</h3>");
        	for(int i=0;i<techs.length;i++)
        		out.println("<b> "+techs[i]+"</b><br>");
        	
        	out.println("<br>");
        	out.println("<b> Work Experience------>"+work+"</b><br>");
        	out.println("</html>");
        	
        	
        }
		
	}

}
