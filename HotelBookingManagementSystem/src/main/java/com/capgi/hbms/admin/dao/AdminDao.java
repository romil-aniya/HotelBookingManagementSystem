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
		
		
		ps=con.prepareStatement("insert into Hotel values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, adminmodel.getHotel_id());
		ps.setString(2, adminmodel.getCity());
		ps.setString(3, adminmodel.getHotel_name());
		ps.setString(4, adminmodel.getAddress());
		ps.setString(5, adminmodel.getDescription());
		ps.setDouble(6, adminmodel.getAvg_rate_per_night());
		ps.setString(7, adminmodel.getPhone_no1());
		ps.setString(8, adminmodel.getPhone_no2());
		ps.setDouble(9, adminmodel.getRating());
		ps.setString(10, adminmodel.getEmail());
		ps.setInt(11, adminmodel.getFax());
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Hotel Added");
			return true;
		}
		System.out.println("Failed");
		return false;

	}
	
	public boolean deleteHotelAdmin(int hotel_id) throws Exception {
		
		ps=con.prepareStatement("delete from hotel where hotel_id = ?");
		ps.setInt(1, hotel_id);
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Hotel Deleted");
			return true;
		}
		System.out.println("Failed");
		return false;
		
	}
	
	public boolean modifyHotelAdmin(int hotel_id) throws Exception {
		
		ps=con.prepareStatement("update hotel set  where hotel_id = ?");
		ps.setInt(1, hotel_id);
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Hotel Modified");
			return true;
		}
		System.out.println("Failed");
		return false;
	}
	
	public boolean addRoomAdmin(RoomModel roommodel) throws Exception {
		
		ps=con.prepareStatement("insert into roomdetails values(?,?,?,?,?,?)");
		ps.setInt(1, roommodel.getHotel_id());
		ps.setInt(2, roommodel.getRoom_id());
		ps.setString(4, roommodel.getRoom_type());
		ps.setInt(3, roommodel.getRoom_no());
		ps.setDouble(5, roommodel.getPer_night_rate());
		ps.setBoolean(6, roommodel.getAvailability());
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Room Added");
			return true;
		}
		System.out.println("Failed");
		
		return false;
	}
	
	public boolean deleteRoomAdmin(int room_id) throws Exception {
		
		ps=con.prepareStatement("delete from hotel where room_id = ?");
		ps.setInt(1, room_id);
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Room Deleted");
			return true;
		}
		System.out.println("Failed");
		return false;
	}
	
	public boolean modifyRoomAdmin(int room_id) throws Exception {
		
		ps=con.prepareStatement("update roomdetails set where room_id = ?");
		ps.setInt(1, room_id);
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Hotel Modified");
			return true;
		}
		System.out.println("Failed");
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
		adminmodel.setPhone_no1(rs.getString(7));
		adminmodel.setPhone_no2(rs.getString(8));
		adminmodel.setRating(rs.getDouble(9));
		adminmodel.setEmail(rs.getString(10));
		adminmodel.setFax(rs.getInt(11));
		listhotelsadmin.add(adminmodel);
		}
		
		return listhotelsadmin;
	} 
	
	public List<RoomModel> listRoomsAdmin() throws Exception{
		List<RoomModel> listroomsAdmin=new ArrayList<RoomModel>();
		
		ps=con.prepareStatement("select * from roomdetails");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			RoomModel roommodel=new RoomModel();
			roommodel.setHotel_id(rs.getInt(1));
			roommodel.setRoom_id(rs.getInt(2));
			roommodel.setRoom_no(rs.getInt(3));
			roommodel.setRoom_type(rs.getString(4));
			roommodel.setPer_night_rate(rs.getDouble(5));
			roommodel.setAvailability(rs.getBoolean(6));
			listroomsAdmin.add(roommodel);
		}
		System.out.println(listroomsAdmin);
		return listroomsAdmin;
	}
	
	public List<BookingModel> listBookingsInHotelAdmin() throws Exception{
		List<BookingModel> listBookingsInHotelAdmin=new ArrayList<BookingModel>();
		 
		ps=con.prepareStatement("select * from bookingdetails");
		//ps=con.prepareStatement("select r.hotel_id, r.room_id, b.booking_id, b.user_id, b.booked_from, b.booked_to, b.amount from roomdetails r, bookingdetails b where b.room_id = r.room_id");
		rs=ps.executeQuery();
		
		BookingModel bookingmodel=new BookingModel();
		while(rs.next()) {
			
			bookingmodel.setRoom_id(rs.getInt(1));
			bookingmodel.setBooking_id(rs.getInt(2));
			bookingmodel.setBooked_from(rs.getString(4));
			bookingmodel.setBooked_to(rs.getString(5));
			bookingmodel.setAmount(rs.getDouble(8));
			
		}
		listBookingsInHotelAdmin.add(bookingmodel);
		
		return listBookingsInHotelAdmin;
	}
	
	public List<CustomerModel> listGuestsInHotelAdmin() throws Exception{
		
		List<CustomerModel> listGuestsInHotelAdmin=new ArrayList<CustomerModel>();
		ps=con.prepareStatement("");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
		CustomerModel customermodel=new CustomerModel();
		
		customermodel.setUser_id(rs.getInt(1));
		customermodel.setPassword(rs.getString(2));
		customermodel.setRole(rs.getString(3));
		customermodel.setUser_name(rs.getString(4));
		customermodel.setMobile_no(rs.getLong(5));
		customermodel.setPhone(rs.getLong(6));
		customermodel.setAddress(rs.getString(7));
		customermodel.setEmail(rs.getString(8));
		
		}
		return listGuestsInHotelAdmin;
	}
	
	public List<BookingModel> viewBookingsInHotelOnDateAdmin() throws Exception{
		List<BookingModel> viewBookingsInHotelOnDateAdmin=new ArrayList<BookingModel>();
		
		ps=con.prepareStatement("");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			BookingModel bookingmodel=new BookingModel();
			bookingmodel.setBooking_id(rs.getInt(1));
			bookingmodel.setRoom_id(rs.getInt(2));
			bookingmodel.setUser_id(rs.getInt(3));
			bookingmodel.setBooked_from(rs.getString(4));
			bookingmodel.setBooked_to(rs.getString(5));
			bookingmodel.setNo_of_adults(rs.getInt(6));
			bookingmodel.setNo_of_children(rs.getInt(7));
			bookingmodel.setAmount(rs.getDouble(8));
			
		}
		
		return viewBookingsInHotelOnDateAdmin;
	}
	
}
