package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Second extends HttpServlet  {
	private static final long serialVersionUID = 1L;
//ServletConfig sc;
//	
//	public void init(ServletConfig config) {
//		
//		this.sc=config;
//	}
    public Second() {
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

//		String usrnm=sc.getInitParameter("username");
//		String paswrd=sc.getInitParameter("password");
//		out.println(usrnm);
//		out.println(paswrd);
		out.println("Hii"+request.getParameter("txtname"));
		out.println("Hello Moto");
		out.println("Servlet Valid serv at"+request.getContextPath());
		out.println("Server Port: "+request.getServerPort());
		out.println("Server Name: "+request.getServerName());
		out.println("Protocol: "+request.getProtocol());
		out.println("Character encoding: "+request.getCharacterEncoding());
		out.println("CONTENT TYPE: "+request.getContentType());
		out.println("Content length: "+request.getContentLength());
		out.println("Remote Address: "+request.getRemoteAddr());
		out.println("Scheme: "+request.getScheme());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
