package com.capgi.hbms.admin.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.service.AdminService;
import com.capgi.hbms.customer.dao.CustomerDao;
import com.capgi.hbms.customer.model.CustomerModel;
import com.capgi.hbms.customer.service.CustomerService;

/**
 * Servlet implementation class AddHotelAdminController
 */

@WebServlet("/AddHotelAdminController")
public class AddHotelAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	AdminService adminservice;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int hotel_id = 0;
		
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

		System.out.println("Ready to call customerservice.registerCustomer(customermodel)");
		
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
