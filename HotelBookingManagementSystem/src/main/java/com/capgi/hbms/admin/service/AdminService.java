package com.capgi.hbms.admin.service;

import java.sql.SQLException;
import java.util.List;

import com.capgi.hbms.admin.dao.AdminDao;
import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;
import com.sun.org.apache.regexp.internal.recompile;

public class AdminService {
	
	AdminDao admindao;
	
	public boolean loginAdmin(String user_name,String password) throws Exception {
		admindao=new AdminDao();
		return false;
		
	}
	
	public boolean logoutAdmin(CustomerModel customermodel) throws Exception {
		admindao=new AdminDao();
		return admindao.logoutAdmin(customermodel);
	}
	
	public boolean addHotelAdmin(AdminModel adminmodel) throws Exception {
		admindao=new AdminDao();
		return admindao.addHotelAdmin(adminmodel);
	}
	
	public boolean deleteHotelAdmin(int hotel_id) throws Exception {
		admindao=new AdminDao();
		return admindao.deleteHotelAdmin(hotel_id);
	}
	
	public boolean modifyHotelAdmin(int hotel_id) throws Exception {
		admindao=new AdminDao();
		return admindao.modifyHotelAdmin(hotel_id);
	}
	
	boolean addRoomAdmin(RoomModel roommodel) throws Exception {
		admindao=new AdminDao();
		return admindao.addRoomAdmin(roommodel);
	}
	
	public boolean deleteRoomAdmin(int room_id) throws Exception {
		admindao=new AdminDao();
		return admindao.deleteRoomAdmin(room_id);
	}
	
	public boolean modifyRoomAdmin(int room_id) throws Exception {
		admindao=new AdminDao();
		return admindao.modifyRoomAdmin(room_id);
	}
	
	public List<AdminModel> listHotelAdmin() throws Exception {
		admindao=new AdminDao();
		return admindao.listHotelsAdmin();
	}
	
	//public List<RoomModel> listRoomAdmin();
	//public List<BookingModel> ListBookingsInHotelAdmin();
	//public List<BookingModel> ListGuestsInHotelAdmin();
	//public List<BookingModel> ViewBookingsInHotelOnDateAdmin();
	
}
