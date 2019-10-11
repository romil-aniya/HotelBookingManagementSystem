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

public class AdminDao implements AdminDaoInterface {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public AdminDao() throws SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.174:3306/hbms","hoteladmin","admin@123");
	}
	
	
	public boolean loginAdmin(String user_id, String password) {
		return false;
	}
	
	public boolean logoutAdmin(CustomerModel customermodel) {
		return false;
	}
	
	public boolean addHotelAdmin(AdminModel adminmodel) throws Exception {
		
		ps=con.prepareStatement("insert into Users values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, adminmodel.getHotel_id());
		ps.setString(2, adminmodel.getCity());
		ps.setString(3, adminmodel.getHotel_name());
		ps.setString(4, adminmodel.getAddress());
		ps.setString(5, adminmodel.getDescription());
		ps.setDouble(6, adminmodel.getAvg_rate_per_night());
		ps.setLong(7, adminmodel.getPhone_no1());
		ps.setLong(8, adminmodel.getPhone_no2());
		ps.setDouble(9, adminmodel.getRating());
		ps.setString(10, adminmodel.getEmail());
		ps.setInt(11, adminmodel.getFax());
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Customer Added");
			return true;
		}
		System.out.println("Failed");
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
	
	public List<AdminModel> listHotelsAdmin() throws SQLException{
		List<AdminModel> listhotelsadmin=new ArrayList<AdminModel>();
		
		ps=con.prepareStatement("select * from hotel");
		rs=ps.executeQuery();
		
		while(rs.next()) {
		AdminModel adminmodel=new AdminModel();
		adminmodel.setHotel_id(rs.getInt(1));
		adminmodel.setCity(rs.getString(2));
		adminmodel.setHotel_name(rs.getString(3));
		adminmodel.setAddress(rs.getString(4));
		adminmodel.setDescription(rs.getString(5));
		adminmodel.setAvg_rate_per_night(rs.getDouble(6));
		adminmodel.setPhone_no1(rs.getInt(7));
		adminmodel.setPhone_no2(rs.getInt(8));
		adminmodel.setRating(rs.getDouble(9));
		adminmodel.setEmail(rs.getString(10));
		adminmodel.setFax(rs.getInt(11));
		listhotelsadmin.add(adminmodel);
		}
		
		return listhotelsadmin;
	} 
	
	public List<RoomModel> listRoomsAdmin() throws Exception{
		List<RoomModel> listroomsAdmin=new ArrayList<RoomModel>();
		ps=con.prepareStatement("select * from roomdetails where hotel_id");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			RoomModel roommodel=new RoomModel();
			roommodel.setHotel_id(rs.getString(1));
			roommodel.setRoom_id(rs.getString(2));
			roommodel.setRoom_no(rs.getInt(3));
			roommodel.setRoom_type(rs.getString(4));
			roommodel.setPer_night_rate(rs.getDouble(5));
			roommodel.setAvailability(rs.getBoolean(6));
			listroomsAdmin.add(roommodel);
		}
		
		ps=con.prepareStatement("select * from roomdetails where hotel_id");
		rs=ps.executeQuery();

		while(rs.next())
		{
			RoomModel roommodel=new RoomModel();
			roommodel.setHotel_id(rs.getString(1));
			roommodel.setRoom_id(rs.getString(2));
			roommodel.setRoom_no(rs.getInt(3));
			roommodel.setRoom_type(rs.getString(4));
			roommodel.setPer_night_rate(rs.getDouble(5));
			roommodel.setAvailability(rs.getBoolean(6));
			listroomsAdmin.add(roommodel);
		}
		
		return listroomsAdmin;
	}
	
	public List<BookingModel> listBookingsInHotelAdmin(){
		List<BookingModel> listBookingsInHotelAdmin=new ArrayList<BookingModel>();
		
		return listBookingsInHotelAdmin;
	}
	
	public List<BookingModel> listGuestsInHotelAdmin(){
		List<BookingModel> listGuestsInHotelAdmin=new ArrayList<BookingModel>();
		
		return listGuestsInHotelAdmin;
	}
	
	public List<BookingModel> viewBookingsInHotelOnDateAdmin(){
		List<BookingModel> viewBookingsInHotelOnDateAdmin=new ArrayList<BookingModel>();
		
		return viewBookingsInHotelOnDateAdmin;
	}
	
}
