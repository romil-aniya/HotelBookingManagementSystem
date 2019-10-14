package com.capgi.hbms.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.admin.service.AdminService;

/**
 * Servlet implementation class AddRoomAdminController
 */
public class AddRoomAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	AdminService adminservice;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int room_id = 0;
		
		int hotel_id = 1;
		int room_no = Integer.parseInt(request.getParameter("room_no"));
		String room_type = request.getParameter("room_type");
		Double per_night_rate = Double.parseDouble(request.getParameter("per_night_rate"));
		String avail = request.getParameter("availability");
		Boolean availability;
		
		if(avail.equals("yes")) {
			availability = true;
		}
		else {
			availability = false;
		}
		
		
		RoomModel roommodel=new RoomModel(hotel_id, room_id, room_type, room_no, per_night_rate, availability);
		adminservice=new AdminService();

		System.out.println("Ready to call customerservice.registerCustomer(customermodel)");
		
		try { 
		if(adminservice.addRoomAdmin(roommodel)){
			System.out.println("Ready to Redirect");
			response.sendRedirect("adminhomepage.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("adminhomepage.jsp");
			//rd.forward(request, response);
			System.out.println("Redirected");
		}
		else {
			response.sendRedirect("addroom.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
		}
		
	}
	
}
