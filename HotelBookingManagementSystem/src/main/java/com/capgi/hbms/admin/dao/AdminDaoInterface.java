package com.capgi.hbms.admin.dao;

import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;

public interface AdminDaoInterface {

	boolean loginAdmin();
	boolean logoutAdmin();
	boolean addHotelAdmin();
	boolean deleteHotelAdmin();
	boolean modifyHotelAdmin();
	boolean addRoomAdmin();
	boolean deleteRoomAdmin();
	boolean modifyRoomAdmin();
	List<AdminModel> listHotelAdmin(); 
	List<RoomModel> listRoomAdmin();
	List<BookingModel> ListBookingsInHotelAdmin();
	List<BookingModel> ListGuestsInHotelAdmin();
	List<BookingModel> ViewBookingsInHotelOnDateAdmin();
	
}
