package br.edu.ifce.dao;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class servlet3 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price4 = 0;
		int totalprice = 0;
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String Usuario  = (String)session.getAttribute("usuario");
		String contador = (String)session.getAttribute("contador");
		int contado = Integer.parseInt(contador);
		
		for(int i=1; i < contado; i++){
			String itens[] = new String[contado - 1];
			itens[i-1] = (String)session.getAttribute("c" + i);
			
			if(itens[i-1].equals("Celular")) {
				price1 = 50;
				
			}
			
			if(itens[i-1].equals("Bolsa")) {
				price2 = 60;
				
			}
			
			if(itens[i-1].equals("Sapato")) {
				price3 = 70;
				
			}
			
			if(itens[i-1].equals("Carteira")) {
				price4 = 80;
				
			}
		}
		
		totalprice = price1 + price2 + price3 + price4;
		out.println("Olá "+ Usuario + ", Obrigado pela sua compra!! ");
		out.println("Sua compra é de R$:" + totalprice);
		out.close();
	}

}
