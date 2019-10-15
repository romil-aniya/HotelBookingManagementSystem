package com.capgi.hbms.customer.dao;

import java.sql.SQLException;
import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface CustomerDaoInterface {

	boolean registerCustomer(CustomerModel customermodel) throws Exception;
	boolean loginCustomer(String user_name, String paasword) throws Exception;
	boolean logoutCustomer(CustomerModel customermodel);
	boolean resetPasswordCustomer(int user_id);
	boolean updateProfileCustomer(int user_id);
	boolean bookRoomCustomer(BookingModel bookingmodel) throws Exception;
	boolean modifyBookingCustomer(BookingModel bookingmodel);
	List<AdminModel> viewHotelCustomer() throws Exception; 
	List<RoomModel> viewRoomCustomer(int hotel_id) throws Exception;
	List<CustomerModel> viewProfileCustomer() throws Exception;
	List<BookingModel> viewBookingCustomer() throws SQLException;

}
