package com.capgi.hbms.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class ViewHotelCustomerController
 */
public class ViewHotelCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("before service");
		CustomerService customerservice = new CustomerService();
		try {
			
			System.out.println("hai");
			List<AdminModel> viewHotelCustomer = customerservice.viewHotelCustomer();
			System.out.println(viewHotelCustomer);
			RequestDispatcher rd=request.getRequestDispatcher("listhotels.jsp");
			request.setAttribute("viewHotelCustomer", viewHotelCustomer);
			rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
