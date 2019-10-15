package com.capgi.hbms.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.admin.service.AdminService;

/**
 * Servlet implementation class ListRoomsAdminController
 */
//@WebServlet("/ListRoomsAdminController")
public class ListRoomsAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("Inside servlet");

	AdminService adminservice=new AdminService();
		
		  try { List<RoomModel> listroomsadmin=adminservice.listRoomsAdmin();
		  RequestDispatcher rd=request.getRequestDispatcher("listroomadmin.jsp");
		  request.setAttribute("listroomsadmin", listroomsadmin); rd.forward(request,
		  response); } catch(Exception e){ e.printStackTrace(); }
		 

		
	}

}
