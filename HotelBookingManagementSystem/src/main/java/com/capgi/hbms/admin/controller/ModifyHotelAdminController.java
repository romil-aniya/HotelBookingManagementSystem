package com.capgi.hbms.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.service.AdminService;

/**
 * Servlet implementation class ModifyHotelAdminController
 */
//@WebServlet("/ModifyHotelAdminController")
public class ModifyHotelAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 
	AdminService adminservice;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		AdminService adminservice=new AdminService();
		try {
			List<AdminModel> modifyhoteladmin=adminservice.listHotelsAdmin();
			RequestDispatcher rd=request.getRequestDispatcher("modifyhotel.jsp");
			request.setAttribute("modifyhotelsadmin", modifyhoteladmin);
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		adminservice = new AdminService();
		
		int hotel_id = Integer.parseInt(request.getParameter("hotel_id"));
		String city = request.getParameter("city");
		String hotel_name = request.getParameter("hotel_name");
		String address = request.getParameter("address");
		String description = request.getParameter("description");
		String email = request.getParameter("email");
		Double avg_rate_per_night = Double.parseDouble(request.getParameter("avg_rate_per_night"));
		String phone_no1 = request.getParameter("phone_no1");
		String phone_no2 = request.getParameter("phone_no2");
		Double rating = Double.parseDouble(request.getParameter("rating"));
		int fax = Integer.parseInt(request.getParameter("fax"));
		
		AdminModel adminmodel=new AdminModel(hotel_id, city, hotel_name, address, description, email, avg_rate_per_night, rating, phone_no1, phone_no2, fax);
		adminservice=new AdminService();
		
		try { 
		if(adminservice.addHotelAdmin(adminmodel)){
			System.out.println("Ready to Redirect");
			response.sendRedirect("adminhomepage.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("adminhomepage.jsp");
			//rd.forward(request, response);
			System.out.println("Redirected");
		}
		else {
			response.sendRedirect("addhotel.jsp");
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
