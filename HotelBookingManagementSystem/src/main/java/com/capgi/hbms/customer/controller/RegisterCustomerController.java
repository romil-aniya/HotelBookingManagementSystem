package com.capgi.hbms.customer.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.customer.dao.CustomerDao;
import com.capgi.hbms.customer.model.CustomerModel;
import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class RegisterCustomerController
 */
@WebServlet("/RegisterCustomerController")
public class RegisterCustomerController extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	CustomerService customerservice;
	CustomerDao customerdao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doPost of registration servlet");
		
		
		
		int user_id = 0;
		
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		
		String user_name = first_name+" "+last_name;
		
		String password = request.getParameter("password");
		String role = "customer";
		String address = request.getParameter("address");
		String email = request.getParameter("email") ;
		long mobile_no = Long.parseLong(request.getParameter("mobile_no"));
		long phone = Long.parseLong(request.getParameter("phone"));
		
		System.out.println(user_name);
		
		CustomerModel customermodel=new CustomerModel(user_id, password, role, user_name, address, email, mobile_no, phone);
		customerservice=new CustomerService();
		
		System.out.println("Ready to call customerservice.registerCustomer(customermodel)");
		
		try {
		//if(customerservice.registerCustomer(customermodel)) 
		if(customerservice.registerCustomer(customermodel)){
			System.out.println("Ready to Redirect");
//			response.sendRedirect("customerhomepage.jsp");
			RequestDispatcher rd=request.getRequestDispatcher("customerhomepage.jsp");
			rd.forward(request, response);
			System.out.println("Redirected");
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
		}
		
	}

}
