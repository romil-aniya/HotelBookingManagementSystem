package com.capgi.hbms.customer.service;

import java.util.List;
import com.capgi.hbms.customer.dao.*;
import com.capgi.hbms.admin.model.*;
import com.capgi.hbms.customer.model.*;

public class CustomerService implements CustomerServiceInterface{
	
	CustomerDao customerdao;
	public boolean registerCustomer(CustomerModel customermodel) throws Exception {
		System.out.println("inside CustmerService class");
		customerdao = new CustomerDao();
		System.out.println("Ready to call customerdao.registerCustomer(customermodel)");
		return customerdao.registerCustomer(customermodel);
	}
	
	public boolean loginCustomer(String user_name, String password) throws Exception{
		customerdao = new CustomerDao();
		return customerdao.loginCustomer(user_name,password);
	}
	
	public boolean logoutCustomer(CustomerModel customermodel) throws Exception {
		customerdao = new CustomerDao();
		return customerdao.logoutCustomer(customermodel);
	}
	
	public boolean resetPasswordCustomer(int user_id) throws Exception {
		customerdao = new CustomerDao();
		return customerdao.resetPasswordCustomer(user_id);
	}
	
	public boolean updateProfileCustomer(int user_id) throws Exception {
		customerdao = new CustomerDao();
		return customerdao.updateProfileCustomer(user_id);
	}
	
	public boolean bookRoomCustomer(BookingModel bookmodel) throws Exception {
		customerdao = new CustomerDao();
		return customerdao.bookRoomCustomer(bookmodel);
	}
	
	public boolean modifyBookingCustomer(BookingModel bookingmodel) throws Exception {
		customerdao = new CustomerDao();
		return customerdao.modifyBookingCustomer(bookingmodel);
	}
	
	public List<AdminModel> viewHotelCustomer() throws Exception {
		customerdao = new CustomerDao();
		return customerdao.viewHotelCustomer();
	}
	
	public List<RoomModel> viewRoomCustomer(int hotel_id) throws Exception {
		customerdao = new CustomerDao();
		return customerdao.viewRoomCustomer(hotel_id);
	}
	
	public List<CustomerModel> viewProfileCustomer() throws Exception {
		customerdao = new CustomerDao();
		return customerdao.viewProfileCustomer();
	}
	
	public List<BookingModel> viewBookingCustomer() throws Exception {
		customerdao = new CustomerDao();
		return customerdao.viewBookingCustomer();
	}
	
}
