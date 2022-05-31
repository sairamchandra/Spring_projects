package VirtusaProj;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Add extends HttpServlet
{
	 public void  doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		 int x= Integer.parseInt( req.getParameter("num1"));
		 int y= Integer.parseInt( req.getParameter("num2"));
		 int z=x+y;
		 req.setAttribute("z", z);
//		 PrintWriter out = res.getWriter();
//		 out.println("<html><body bgcolor='hotpink' >");
// 		 out.println("output is :" + z);
// 		 out.print("</body></html>");
		 		
		 RequestDispatcher rd=req.getRequestDispatcher("ss");
		 rd.forward(req, res);
		 res.sendRedirect("https://www.google.com");
		 
	 }
}
