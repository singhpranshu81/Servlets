package com.xyz

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	ServletConfig sc;
	
	public void init(ServletConfig config) {
		
		this.sc=config;
	}
	
    public First() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		String un=request.getParameter("txtname");
		String pass=request.getParameter("pass");
		
		String usrnm=sc.getInitParameter("username");
		String paswrd=sc.getInitParameter("password");
		
		//if(un.equals("pran")&& pass.equals("qq")) {
		if(un.equals(usrnm)&& pass.equals(paswrd)) {
		out.println("Welcome : "+request.getParameter("txtname"));
		
		rd=request.getRequestDispatcher("Second");
		rd.include(request, response);
		
		Enumeration enn=request.getParameterNames();
		while(enn.hasMoreElements()) {
			String attr=(String) enn.nextElement();
			out.println("Attribute name is: "+attr);
			out.println("value are: "+ request.getParameter(attr));
		}
		}
		else {
			out.println("Sahi Bata bhai");
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
