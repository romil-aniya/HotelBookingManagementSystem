package com.capgi.hbms.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class ViewRoomCustomerController
 */
public class ViewRoomCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int hotel_id=1;
		CustomerService customerservice = new CustomerService();
		try {
			
			System.out.println("hai");
			List<RoomModel> viewRoomCustomer = customerservice.viewRoomCustomer(hotel_id);
			System.out.println(viewRoomCustomer);
			RequestDispatcher rd=request.getRequestDispatcher("viewroomscustomer.jsp");
			request.setAttribute("viewRoomCustomer", viewRoomCustomer);
			rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
