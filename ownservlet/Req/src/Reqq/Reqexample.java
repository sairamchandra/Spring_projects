package Reqq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reqexample
 */
@WebServlet("/Reqexample")
public class Reqexample extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getContentType();
		PrintWriter pout=response.getWriter();
		String uname=request.getParameter("name");
		pout.println("hello  :"+uname);
	}

}
