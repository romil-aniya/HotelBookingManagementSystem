package com.capgi.hbms.admin.service;

import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface AdminServiceInterface {

	boolean loginAdmin(CustomerModel Customermodel);
	boolean logoutAdmin(CustomerModel Customermodel);
	boolean addHotelAdmin(AdminModel adminmodel);
	boolean deleteHotelAdmin(AdminModel adminmodel);
	boolean modifyHotelAdmin(AdminModel adminmodel);
	boolean addRoomAdmin(RoomModel roommodel);
	boolean deleteRoomAdmin(RoomModel roommodel);
	boolean modifyRoomAdmin(RoomModel roommodel);
	List<AdminModel> listHotelAdmin(); 
	List<RoomModel> listRoomAdmin();
	List<BookingModel> ListBookingsInHotelAdmin();
	List<BookingModel> ListGuestsInHotelAdmin();
	List<BookingModel> ViewBookingsInHotelOnDateAdmin();
	
}
