package br.edu.ifce.controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Usuario = null;
		String item = null;
		int i = 1;
		
		Enumeration e = null;
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		Usuario  = (String)session.getAttribute("usuario");
		e = request.getParameterNames();
		
		while(e.hasMoreElements()) {
			String items = (String)e.nextElement();
			session.setAttribute("c" + i, items);
			i++;
		}
		
		session.setAttribute("contador", i + "");
		session.setAttribute("usuario", Usuario);
		RequestDispatcher dis = request.getRequestDispatcher("servlet3");
		dis.forward(request, response);
	}

}
