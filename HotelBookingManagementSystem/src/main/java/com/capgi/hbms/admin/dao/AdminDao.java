package com.capgi.hbms.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgi.hbms.admin.model.AdminModel;
import com.capgi.hbms.admin.model.BookingModel;
import com.capgi.hbms.admin.model.RoomModel;
import com.capgi.hbms.customer.model.CustomerModel;

public class AdminDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public AdminDao() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.174:3306/hbms","hoteladmin","admin@123");
	}
	
	
	public boolean loginAdmin(CustomerModel Customermodel) {
		return false;
	}
	
	public boolean logoutAdmin(CustomerModel Customermodel) {
		return false;
	}
	
	public boolean addHotelAdmin(AdminModel adminmodel) {
		return false;
	}
	
	public boolean deleteHotelAdmin(int hotel_id) {
		return false;
	}
	
	public boolean modifyHotelAdmin(int hotel_id) {
		return false;
	}
	
	public boolean addRoomAdmin(RoomModel roommodel) {
		return false;
	}
	
	public boolean deleteRoomAdmin(int room_id) {
		return false;
	}
	
	public boolean modifyRoomAdmin(int room_id) {
		return false;
	}
	
	public List<AdminModel> listHotelsAdmin(){
		List<AdminModel> listhotelsadmin=new ArrayList<AdminModel>();
		
		return listhotelsadmin;
	} 
	
	public boolean listRoomsAdmin(){
		List<AdminModel> listroomsAdmin=new ArrayList<AdminModel>();
		
		return false;
	}
	
	public boolean listBookingsInHotelAdmin(){
		List<BookingModel> listBookingsInHotelAdmin=new ArrayList<BookingModel>();
		
		return false;
	}
	
	public boolean listGuestsInHotelAdmin(){
		List<RoomModel> listGuestsInHotelAdmin=new ArrayList<RoomModel>();
		
		return false;
	}
	
	public boolean viewBookingsInHotelOnDateAdmin(){
		List<BookingModel> viewBookingsInHotelOnDateAdmin=new ArrayList<BookingModel>();
		
		return false;
	}
	
}
