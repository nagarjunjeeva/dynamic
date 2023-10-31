package org.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServer extends HttpServlet {

	  
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String par1 = req.getParameter("num1");
		int i = Integer.parseInt(par1);
		String par2 = req.getParameter("num2");
		int j = Integer.parseInt(par1);
		int k=i+j;
		req.setAttribute("par3", k);
		PrintWriter out = resp.getWriter();
		out.println("Addition server called :  "+ k);
		RequestDispatcher rd = req.getRequestDispatcher("/multiply");
		rd.include(req, resp);
	}
}
