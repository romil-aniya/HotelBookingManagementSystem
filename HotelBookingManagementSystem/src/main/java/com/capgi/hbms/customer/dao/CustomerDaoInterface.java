package com.capgi.hbms.customer.dao;

import java.util.List;

import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface CustomerDaoInterface {

	boolean registerCustomer(CustomerModel customermodel);
	boolean loginCustomer(String user_name, String paasword);
	boolean logoutCustomer(CustomerModel customermodel);
	boolean resetPasswordCustomer(int user_id);
	boolean updateProfileCustomer(int user_id);
	boolean bookRoomCustomer(RoomModel roommodel);
	boolean modifyBookingCustomer(BookingModel bookingmodel);
	List<CustomerModel> viewHotelCustomer(); 
	List<RoomModel> viewRoomCustomer();
	List<CustomerModel> viewProfileCustomer();
	List<BookingModel> viewBookingCustomer();

}
