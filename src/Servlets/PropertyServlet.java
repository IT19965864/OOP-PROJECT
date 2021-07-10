package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.PropertyDBUtil;
import Entity.Property;


@WebServlet("/PropertyServlet")
public class PropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			try {
				List<Property> prDetails =PropertyDBUtil.Display();
				request.setAttribute("prDetails",prDetails);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("viewProperty.jsp");
			dis.forward(request, response);
		
	}	

}
