package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.PropertyDBUtil;


@WebServlet("/DeletePropertyServlet")
public class DeletePropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String propertyid = request.getParameter("pid");
		
		boolean isTrue;
		
		isTrue = PropertyDBUtil.DeleteProperty(propertyid);
		
		if(isTrue == true) {
			 
			RequestDispatcher dis = request.getRequestDispatcher("PropertyDelete.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis = request.getRequestDispatcher("ErrorPropertyDelete.jsp");
			dis.forward(request, response);
		}
	}

}
