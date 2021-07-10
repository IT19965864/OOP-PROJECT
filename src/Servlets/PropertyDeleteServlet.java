package Servlets;

import java.io.IOException;


import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Entity.Property;
import Model.PropertyDBUtil;

@WebServlet("/PropertyDeleteServlet")
public class PropertyDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String propertyid = request.getParameter("propertyid");
		
		try {
			List<Property> DeleteDetails =PropertyDBUtil.DisplayDeleteProperty(propertyid);
			request.setAttribute("DeleteDetails",DeleteDetails);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("DeleteProperty.jsp");
		dis.forward(request, response);
	}

}
