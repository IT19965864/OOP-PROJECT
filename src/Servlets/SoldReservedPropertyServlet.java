package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.SoldReservedProperty;
import Model.PropertyDBUtil;


@WebServlet("/SoldReservedPropertyServlet")
public class SoldReservedPropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {	
			List<SoldReservedProperty> soldDetails = PropertyDBUtil.DisplaySoldReservedProperty();
			request.setAttribute("soldDetails",soldDetails);
		 }
		 catch(Exception e) {
			  e.printStackTrace();
		 }
		
		RequestDispatcher dis = request.getRequestDispatcher("SoldProperty.jsp");
		dis.forward(request, response);
		
		
	}

}
