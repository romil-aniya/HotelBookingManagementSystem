package com.capgi.hbms.customer.service;

import java.util.List;

public class CustomerService implements CustomerServiceInterface{
	
	CustomerDao customerdao;
	
	public boolean registerCustomer(CustomerModel customermodel) {
		customerdao = new CustomerDao();
		return customerdao.registerCustomer(customermodel);
	}
	
	public boolean loginCustomer(String user_name, String password) throws Exception{
		customerdao = new CustomerDao();
		return customerdao.loginCustomer(user_name,password);
	}
	
	public boolean logoutCustomer(CustomerModel customermodel) {
		customerdao = new CustomerDao();
		return customerdao.logoutCustomer(customermodel);
	}
	
	public boolean resetPasswordCustomer(int user_id) {
		customerdao = new CustomerDao();
		return customerdao.resetPasswordCustomer(user_id);
	}
	
	public boolean updateProfileCustomer(int user_id) {
		customerdao = new CustomerDao();
		return customerdao.updateProfileCustomer(user_id);
	}
	
	public boolean bookRoomCustomer(RoomModel roommodel) {
		customerdao = new CustomerDao();
		return customerdao.bookRoomCustomer(roommodel);
	}
	
	public boolean modifyBookingCustomer(BookingModel bookingmodel) {
		customerdao = new CustomerDao();
		return customerdao.modifyBookingCustomer(bookingmodel);
	}
	
	public List<CustomerModel> viewHotelCustomer(){
		customerdao = new CustomerDao();
		return customerdao.viewHotelCustomer();
	}
	
	public List<RoomModel> viewRoomCustomer(){
		customerdao = new CustomerDao();
		return customerdao.viewRoomCustomer();
	}
	
	public List<CustomerModel> viewProfileCustomer(){
		customerdao = new CustomerDao();
		return customerdao.viewProfileCustomer();
	}
	
	public List<BookingModel> viewBookingCustomer(){
		customerdao = new CustomerDao();
		return customerdao.viewBookingCustomer();
	}
	
}
