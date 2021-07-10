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


@WebServlet("/PropertyReserveServlet")
public class PropertyReserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String propertyID = request.getParameter("propertyid");
		String buyerNIC = request.getParameter("buyernic");
		int id = Integer.parseInt(propertyID);
		
		boolean isTrue ;
		boolean IStrue;
		
		isTrue = PropertyDBUtil.UpdateReservedProperty(propertyID, buyerNIC);
		
		if(isTrue == false) {
			RequestDispatcher dis = request.getRequestDispatcher("Error.jsp");
			dis.forward(request, response);
		}
		if(isTrue ==true) {
			try {
				List<Property> pr1Details = PropertyDBUtil.DisplayDetails(propertyID);
				request.setAttribute("pr1Details",pr1Details);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("PropertyView.jsp");
			dis.forward(request, response);
		
		}
		
		IStrue = PropertyDBUtil.InsertReservedProperty(id,buyerNIC);
		
		if(IStrue == false) {
			RequestDispatcher dis = request.getRequestDispatcher("Error.jsp");
			dis.forward(request, response);
		}
	}

}
