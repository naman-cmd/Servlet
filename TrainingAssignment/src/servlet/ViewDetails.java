package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TrainingDao;
import bean.TrainingBean;
/**
 * Servlet implementation class ViewDetails
 */
@WebServlet("servlet.ViewDetails")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		ArrayList<TrainingBean> list=TrainingDao.getRecords();
		out.print("<table><tr><th>TrainingId</th><th>TrainingName</th><th>AvailableSeat</th></tr>");
		for(int i=0;i<list.size();i++) {
			
			out.print("<tr>");
			for(int j=0;j<list.size();j++) {
				out.print("<td>"+list.get(j).getId()+"</td>");
				out.print("<td>"+list.get(j).getId()+"</td>");
				out.print("<td>"+list.get(j).getId()+"</td>");
			}
			out.print("<a href=\"\">Enroll</a>");
			out.print("</tr>");
		}
		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
