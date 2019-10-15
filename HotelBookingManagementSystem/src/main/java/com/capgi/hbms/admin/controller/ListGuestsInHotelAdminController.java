package com.capgi.hbms.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.service.AdminService;
import com.capgi.hbms.customer.model.CustomerModel;

/**
 * Servlet implementation class ListGuestsInHotelAdminController
 */
public class ListGuestsInHotelAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
AdminService adminservice=new AdminService();
		
		try {
			List<CustomerModel> listguestsinhoteladmin=adminservice.listGuestsInHotelAdmin();
			RequestDispatcher rd=request.getRequestDispatcher("guestsinhotel.jsp");
			request.setAttribute("listguestsinhoteladmin", listguestsinhoteladmin);
			rd.forward(request, response);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
