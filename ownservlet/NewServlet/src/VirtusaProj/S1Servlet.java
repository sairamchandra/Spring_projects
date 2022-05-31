package VirtusaProj;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1Servlet extends HttpServlet {

	 public void  doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		 int z=(int) req.getAttribute("z");
		 z=z*z;
		 PrintWriter out = res.getWriter();
		 out.println("result is :"+z);
 		
	 }
}