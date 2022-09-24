package com.cestar.servlets;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloworld
 */
@WebServlet("/Helloworld")
public class Helloworld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Helloworld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("e_id"));
		String name = request.getParameter("e_name");
		String contact = request.getParameter("e_contact");
		String city = request.getParameter("e_city");
		String email = request.getParameter("e_email");
		
		out.print("<body bgcolor='Orange'>");
		out.print("<h1 style='color:red; background-color:yellow'>This is the first servlet</h1>");
		out.print("<h3>Employee ID: "+id+"</h3><br>");
		out.print("<h3>Employee Name: "+name+"</h3><br>");
		out.print("<h3>Employee Contact: "+contact+"</h3><br>");
		out.print("<h3>Employee City: "+city+"</h3><br>");
		out.print("<h3>Employee Email: "+email+"</h3><br>");
		out.print("</body>");
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
