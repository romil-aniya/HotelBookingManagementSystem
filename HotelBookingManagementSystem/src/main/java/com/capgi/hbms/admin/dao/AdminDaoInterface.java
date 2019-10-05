package com.capgi.hbms.admin.dao;

import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface AdminDaoInterface {

	boolean loginAdmin(CustomerModel Customermodel);
	boolean logoutAdmin(CustomerModel Customermodel);
	boolean addHotelAdmin(AdminModel adminmodel);
	boolean deleteHotelAdmin(AdminModel adminmodel);
	boolean modifyHotelAdmin(AdminModel adminmodel);
	boolean addRoomAdmin(RoomModel roommodel);
	boolean deleteRoomAdmin(RoomModel roommodel);
	boolean modifyRoomAdmin(RoomModel roommodel);
	
	List<AdminModel> listHotelsAdmin(); 
	List<RoomModel> listRoomsAdmin();
	List<BookingModel> listBookingsInHotelAdmin();
	List<BookingModel> listGuestsInHotelAdmin();
	List<BookingModel> viewBookingsInHotelOnDateAdmin();
	
}
