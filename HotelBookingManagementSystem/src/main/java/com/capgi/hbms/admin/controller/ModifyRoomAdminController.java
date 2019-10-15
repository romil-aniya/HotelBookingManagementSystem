package com.capgi.hbms.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.admin.service.AdminService;

/**
 * Servlet implementation class ModifyRoomAdminController
 */
public class ModifyRoomAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	AdminService adminservice;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		AdminService adminservice=new AdminService();
		
		try {
		List<RoomModel> modifyroomsadmin=adminservice.listRoomsAdmin();
		RequestDispatcher rd=request.getRequestDispatcher("modifyroom.jsp");
		request.setAttribute("modifyroomsadmin", modifyroomsadmin);
		rd.forward(request, response);
		}
		catch(Exception e){
			e.printStackTrace();
		}

			
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int room_id = Integer.parseInt(request.getParameter("room_id"));
		int hotel_id = Integer.parseInt(request.getParameter("hotel_id"));
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
