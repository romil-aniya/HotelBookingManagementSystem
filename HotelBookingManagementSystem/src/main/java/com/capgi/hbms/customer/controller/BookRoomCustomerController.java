package com.capgi.hbms.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class BookRoomCustomerController
 */
public class BookRoomCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService cs;
		System.out.println("inside controller");
		
		int booking_id=Integer.parseInt(request.getParameter("booking_id"));
		int user_id=Integer.parseInt(request.getParameter("user_id"));
		int room_id=Integer.parseInt(request.getParameter("room_id"));
		String booked_from=request.getParameter("booked_from");
		String booked_to=request.getParameter("booked_to");
		int no_of_adults=Integer.parseInt(request.getParameter("no_of_adults"));
		int no_of_children=Integer.parseInt(request.getParameter("no_of_children"));

		double amount=Double.parseDouble(request.getParameter("amount"));
		BookingModel bookingmodel=new BookingModel(booking_id,user_id,room_id,booked_from,booked_to,no_of_adults,no_of_children,amount);
		cs=new CustomerService();
		System.out.println("data entered");
		try {
			if(cs.bookRoomCustomer(bookingmodel)) {
				response.sendRedirect("payment.jsp");
			}
			else {
				response.sendRedirect("viewroomcustomer.jsp");
			}
			}
			catch (Exception e) {
				response.sendRedirect("viewroomcustomer.jsp");
			}
	}

}
