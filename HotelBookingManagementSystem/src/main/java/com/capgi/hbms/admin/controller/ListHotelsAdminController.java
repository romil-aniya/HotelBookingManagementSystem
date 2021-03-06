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
 * Servlet implementation class ListHotelsAdminController
 */

@WebServlet("/ListHotelsAdminController")
public class ListHotelsAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminService adminservice=new AdminService();
		try {
			List<AdminModel> listhotelsadmin=adminservice.listHotelsAdmin();
			RequestDispatcher rd=request.getRequestDispatcher("listhoteladmin.jsp");
			request.setAttribute("listhotelsadmin", listhotelsadmin);
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
