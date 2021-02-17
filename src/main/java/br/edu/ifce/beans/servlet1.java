package br.edu.ifce.beans;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Usuario = request.getParameter("usuario");
		String Senha = request.getParameter("senha");
		
		boolean contador = false;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(Usuario.equals("admin") && Senha.equals("admin")) {
			out.println(Usuario + " Bem Vindo");
			contador = true;
			HttpSession session = request.getSession(true);
			session.setAttribute("usuario", Usuario);
		}else {
			contador = false;
			out.println("Login ou senha inválidos");
		}
		
		if(contador == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Lista_de_produtos.jsp");
			dis.forward(request, response);
		}
	}

}
