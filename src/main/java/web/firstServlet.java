package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class firstServlet extends HttpServlet {

	public firstServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1>"+nom+"</h1>");
		out.println("</body>");
		
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}
	
	

}
