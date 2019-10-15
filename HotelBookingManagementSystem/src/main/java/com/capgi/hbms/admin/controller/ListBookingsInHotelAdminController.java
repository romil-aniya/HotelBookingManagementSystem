package com.capgi.hbms.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.service.AdminService;

/**
 * Servlet implementation class ListBookingsInHotelAdminController
 */
public class ListBookingsInHotelAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Aa gii m yaha tak");
		AdminService adminservice=new AdminService();
		try {
			List<BookingModel> listbookingsinhotel=adminservice.listBookingsInHotelAdmin();
			RequestDispatcher rd=request.getRequestDispatcher("bookingsinhotel.jsp");
			request.setAttribute("listbookingsinhotel", listbookingsinhotel);
			rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
	}
		
	}

}
