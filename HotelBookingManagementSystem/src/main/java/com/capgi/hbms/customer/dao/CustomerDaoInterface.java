package com.capgi.hbms.customer.dao;

import java.util.List;

import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface CustomerDaoInterface {

	boolean registerCustomer();
	boolean loginCustomer();
	boolean logoutCustomer();
	boolean resetPasswordCustomer();
	boolean updateProfileCustomer();
	boolean bookRoomCustomer();
	boolean modifyBookingCustomer();
	List<CustomerModel> viewHotelCustomer(); 
	List<RoomModel> viewRoomCustomer();
	List<CustomerModel> viewProfileCustomer();
	List<BookingModel> viewBookingCustomer();

}
