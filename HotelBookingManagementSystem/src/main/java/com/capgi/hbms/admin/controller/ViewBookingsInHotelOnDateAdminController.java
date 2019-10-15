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
 * Servlet implementation class ViewBookingsInHotelOnDateAdminController
 */
public class ViewBookingsInHotelOnDateAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService adminservice=new AdminService();
		try {
			
			List<BookingModel> viewbookingsinhotelondateadmin=adminservice.listBookingsInHotelAdmin();
			RequestDispatcher rd=request.getRequestDispatcher("bookingsondate.jsp");
			request.setAttribute("viewbookingsinhotelondateadmin", viewbookingsinhotelondateadmin);
			rd.forward(request, response);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
