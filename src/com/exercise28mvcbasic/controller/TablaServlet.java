package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TablaServlet")
public class TablaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//MIME
		response.setContentType("text/html chartset= 'utf-8'");
		//OUTPUT CONFIGURATION 
		PrintWriter output=response.getWriter();
		//PARAMETHERS
		int table=
				Integer.parseInt(request.getParameter("txtTable"));
		int range=
				Integer.parseInt(request.getParameter("txtRange"));
		//ALGORITHMS
			for(int j=0;j<=range;j++) {
				output.append("<p>");
				output.append(String.format("%d x %d = %d",table,j,table*j));
				output.append("</p>");
		}
		//CLOSE OUTPUTS
		output.close();
	}

}
