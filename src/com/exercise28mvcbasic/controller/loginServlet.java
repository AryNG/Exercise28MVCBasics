package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//MIME TYPE DEL OBJETO RESPONSE-------------------------------------------------------------------------------------------
		response.setContentType("text/html");

//ASIGNACION DE LA SALIDA DEL OBJETO OUTPUT, REDUCE LA CANTIDAD DE COGIDO A ESCRIBIR---------------------------------------
		PrintWriter output = response.getWriter();
		
//PARAMETROS---------------------------------------------------------------------------------------------------------------
		String username = request.getParameter("txtUser");
		String password = request.getParameter("txtPass");
		
		output.append("<html>");
		output.append("<head>");
		output.append("<title>");
		output.append("Data imput by the user");
		output.append("</title>");
		output.append("</head>");
		output.append("<body>");
		output.append("<h2>");
		output.append("I had to write this all by hand");
		output.append("</h2>");
		output.append("<p>");
		output.append("User: "+username);
		output.append("</p>");
		output.append("Password:  "+password);
		output.append("</p>");
		output.append("</body>");
		output.append("</html>");

//CIERRO AL OBJTO RESPONSE------------------------------------------------------------------------------------------------
		output.close();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/jason");

		PrintWriter output= response.getWriter();
		String username=request.getParameter("txtUser");
		String password=request.getParameter("txtPass");
		
		output.append("{");
		output.append("\"Username\":\""+username+"\",");
		output.append("\"Password\":\""+password+"\",");
		output.append("}");




	}
}
/*El get te va a mostrar los parametros dentro de tu html por medio de tu url, ademas con el post ayuda a que tu url sea mucho más corta. Get es más lento
 * porque llega por medio de texto y en post por metodo serializable*/
