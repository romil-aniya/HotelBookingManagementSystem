package com.capgi.hbms.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class LoginCustomerController
 */

@WebServlet("/LoginCustomerController")
public class LoginCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerService customerservice = new CustomerService();
		
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		
		try {
			if(customerservice.loginCustomer(user_name, password)) {
				HttpSession ssn=request.getSession();
				ssn.setAttribute("user_name", user_name);
				System.out.println(user_name+" wants to login");
				if(user_name.equals("admin")) {
					response.sendRedirect("adminhomepage.jsp");
				}
				else {
					response.sendRedirect("customerhomepage.jsp");
				}
			}
			else {
				response.sendRedirect("homepage.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("homepage.jsp");
		}
		
		
	}

}
