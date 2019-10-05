package com.capgi.hbms.customer.service;

import java.util.List;

import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface CustomerServiceInterface {

	boolean registerCustomer(CustomerModel customermodel);
	boolean loginCustomer(CustomerModel customermodel);
	boolean logoutCustomer(CustomerModel customermodel);
	boolean resetPasswordCustomer(CustomerModel customermodel);
	boolean updateProfileCustomer(CustomerModel customermodel);
	boolean bookRoomCustomer(RoomModel roommodel);
	boolean modifyBookingCustomer(BookingModel bookingmodel);
	List<CustomerModel> viewHotelCustomer(); 
	List<RoomModel> viewRoomCustomer();
	List<CustomerModel> viewProfileCustomer();
	List<BookingModel> viewBookingCustomer();
	
}
