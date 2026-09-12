package com.demo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class second_servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		PrintWriter writer=resp.getWriter();
		writer.append("<h1>Welcome to java development</h1>");
	}

}
