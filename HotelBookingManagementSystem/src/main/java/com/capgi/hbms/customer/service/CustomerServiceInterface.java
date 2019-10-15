package com.capgi.hbms.customer.service;

import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface CustomerServiceInterface {

	boolean registerCustomer(CustomerModel customermodel) throws Exception;
	boolean loginCustomer(String user_name, String password) throws Exception;
	boolean logoutCustomer(CustomerModel customermodel) throws Exception;
	boolean resetPasswordCustomer(int user_id) throws Exception;
	boolean updateProfileCustomer(int user_id) throws Exception;
	boolean bookRoomCustomer(BookingModel bookingmodel) throws Exception;
	boolean modifyBookingCustomer(BookingModel bookingmodel) throws Exception;
	List<AdminModel> viewHotelCustomer() throws Exception; 
	List<RoomModel> viewRoomCustomer(int hotel_id) throws Exception;
	List<CustomerModel> viewProfileCustomer() throws Exception;
	List<BookingModel> viewBookingCustomer() throws Exception;
	
}
