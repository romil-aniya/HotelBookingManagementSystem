package com.capgi.hbms.admin.service;

import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface AdminServiceInterface {
	
	boolean loginAdmin(String user_name, String password) throws Exception;
	boolean logoutAdmin(CustomerModel customermodel) throws Exception;
	boolean addHotelAdmin(AdminModel adminmodel) throws Exception;
	boolean deleteHotelAdmin(int hotel_id) throws Exception;
	boolean modifyHotelAdmin(int hotel_id) throws Exception;
	boolean addRoomAdmin(RoomModel roommodel) throws Exception;
	boolean deleteRoomAdmin(int room_id) throws Exception;
	boolean modifyRoomAdmin(int room_id) throws Exception;
	
	List<AdminModel> listHotelsAdmin() throws Exception; 
	List<RoomModel> listRoomsAdmin() throws Exception;
	List<BookingModel> listBookingsInHotelAdmin() throws Exception;
	List<CustomerModel> listGuestsInHotelAdmin() throws Exception;
	List<BookingModel> viewBookingsInHotelOnDateAdmin() throws Exception;
	
}
