package com.capgi.hbms.admin.dao;

import java.sql.SQLException;
import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public interface AdminDaoInterface {

	boolean loginAdmin(String user_id, String password);
	boolean logoutAdmin(CustomerModel customermodel);
	boolean addHotelAdmin(AdminModel adminmodel) throws Exception;
	boolean deleteHotelAdmin(int hotel_id) throws Exception;
	boolean modifyHotelAdmin(int hotel_id) throws Exception;
	boolean addRoomAdmin(RoomModel roommodel) throws Exception;
	boolean deleteRoomAdmin(int room_id) throws Exception;
	boolean modifyRoomAdmin(int room_id) throws Exception;
	
	
	List<AdminModel> listHotelsAdmin() throws SQLException; 
	List<RoomModel> listRoomsAdmin() throws Exception;
	List<BookingModel> listBookingsInHotelAdmin() throws Exception;
	List<CustomerModel> listGuestsInHotelAdmin() throws Exception;
	List<BookingModel> viewBookingsInHotelOnDateAdmin() throws Exception;
	
}
