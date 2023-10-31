package org.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiplyServer extends HttpServlet {

	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Object a = req.getAttribute("par3");
		
		int b=(int) a;
		b=b*b;
		PrintWriter out = resp.getWriter();
		out.println("Multiply server called : "+b);
	}
}
