package com.capgi.hbms.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class ViewBookingCustomerController
 */
@WebServlet("/ViewBookingCustomerController")
public class ViewBookingCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside viewbookingcustomercontroller");
		
		CustomerService customerservice = new CustomerService();
		try {
			System.out.println("inside try");
			List<BookingModel> viewBookingCustomer = customerservice.viewBookingCustomer();
			System.out.println("redirecting...");
			RequestDispatcher rd=request.getRequestDispatcher("showbookingscustomer.jsp");
			request.setAttribute("viewBookingCustomer", viewBookingCustomer);
			rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
