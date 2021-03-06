package com.capgi.hbms.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.service.AdminService;

/**
 * Servlet implementation class DeleteRoomAdminController
 */
@WebServlet("/DeleteRoomAdminController")
public class DeleteRoomAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	AdminService adminservice;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adminservice = new AdminService();
		
		int room_id=1;
		
		try {
			if(adminservice.deleteRoomAdmin(room_id)) {
				RequestDispatcher rd = request.getRequestDispatcher("adminhomepage.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
