package com.capgi.hbms.customer.dao;

import com.capgi.hbms.customer.model.*;
import com.capgi.hbms.admin.dao.CryptWithMD5;
import com.capgi.hbms.admin.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements CustomerDaoInterface{

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public CustomerDao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.174:3306/hbms","hoteladmin","admin@123");
		System.out.println("JDBC connection created");
	}
	
	public boolean registerCustomer(CustomerModel customermodel) throws Exception {
		
		System.out.println("inside customerdao.registerCustomer(customermodel)");
		
		//encrypting password
		CryptWithMD5 md5 = new CryptWithMD5();
		String password = md5.cryptWithMD5(customermodel.getPassword()); 
		
		ps=con.prepareStatement("insert into Users values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, customermodel.getUser_id());
		ps.setString(2, password);
		ps.setString(3, customermodel.getRole());
		ps.setString(4, customermodel.getUser_name());
		ps.setLong(5, customermodel.getMobile_no());
		ps.setLong(6, customermodel.getPhone());
		ps.setString(7, customermodel.getAddress());
		ps.setString(8, customermodel.getEmail());
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Customer Added");
			return true;
		}
		System.out.println("Failed");
		return false;

	}
	
	public boolean loginCustomer(String user_name, String password) throws Exception  {
		
		ps=con.prepareStatement("select * from users where user_name=? and password=?");
		
		CryptWithMD5 md5 = new CryptWithMD5();
		String passworddencrypted = md5.cryptWithMD5(password);
		
		ps.setString(1, user_name);
		ps.setString(2, passworddencrypted);
		
		rs=ps.executeQuery();
		
		if(rs.next()) {
			return true;
		}
		return false;

	}
	
	public boolean logoutCustomer(CustomerModel customermodel) {
		return false;
	}
	
	public boolean resetPasswordCustomer(int user_id) {
		return false;
	}
	
	public boolean updateProfileCustomer(int user_id) {
		return false;
	}
	
	public boolean bookRoomCustomer(BookingModel bookingmodel) throws Exception {
		
		System.out.println("inside dao function");
		ps=con.prepareStatement("insert into bookingdetails values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, bookingmodel.getBooking_id());
		ps.setInt(2, bookingmodel.getUser_id());
		ps.setInt(3, bookingmodel.getRoom_id());
		ps.setString(4, bookingmodel.getBooked_from());
		ps.setString(5, bookingmodel.getBooked_to());
		ps.setInt(6, bookingmodel.getNo_of_adults());
		ps.setInt(7, bookingmodel.getNo_of_children());
		ps.setDouble(8, bookingmodel.getAmount());
		System.out.println("after query");
		
		int n=ps.executeUpdate();
		System.out.println("Query Executed");
		if(n>0) {
			System.out.println("Booked");
			return true;
		}
		System.out.println("Failed");
		return false;
		
		
	}
	
	public boolean modifyBookingCustomer(BookingModel bookingmodel) {
		return false;
	}
	
	public List<AdminModel> viewHotelCustomer() throws Exception{
		List<AdminModel> viewHotelCustomer = new ArrayList<AdminModel>();
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
		viewHotelCustomer.add(adminmodel);
		}
		return viewHotelCustomer;
	}
	
	public List<RoomModel> viewRoomCustomer(int hotel_id) throws Exception{
		List<RoomModel> viewRoomCustomer = new ArrayList<RoomModel>();
		ps=con.prepareStatement("select * from roomdetails where hotel_id = "+hotel_id);
		rs=ps.executeQuery();
		while(rs.next()) {
		RoomModel roommodel=new RoomModel();
		roommodel.setHotel_id(rs.getInt(1));
		roommodel.setRoom_id(rs.getInt(2));
		roommodel.setRoom_no(rs.getInt(3));
		roommodel.setRoom_type(rs.getString(4));
		roommodel.setPer_night_rate(rs.getDouble(5));
		roommodel.setAvailability(rs.getBoolean(6));
		viewRoomCustomer.add(roommodel);
		}
		
		return viewRoomCustomer;
	}
	public List<CustomerModel> viewProfileCustomer() throws Exception{
		List<CustomerModel> viewProfileCustomer = new ArrayList<CustomerModel>();
		
		ps=con.prepareStatement("select * from users where user_name=?");
		String user_name = "user";
		ps.setString(1, user_name);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			
			CustomerModel customermodel = new CustomerModel();
			customermodel.setUser_name(rs.getString(4));
			customermodel.setMobile_no(rs.getLong(5));
			customermodel.setAddress(rs.getString(7));
			customermodel.setEmail(rs.getString(8));
			customermodel.setPhone(rs.getLong(6));
			viewProfileCustomer.add(customermodel);
		}
		
		return viewProfileCustomer;
	}
	
	public List<BookingModel> viewBookingCustomer() throws SQLException{
		List<BookingModel> viewBookingCustomer = new ArrayList<BookingModel>();
		System.out.println("inside customer dao");
		ps=con.prepareStatement("select * from bookingdetails");
		rs=ps.executeQuery();
		
		while(rs.next()) {
		BookingModel bookingmodel=new BookingModel();
		bookingmodel.setBooking_id(rs.getInt(1));
		bookingmodel.setRoom_id(rs.getInt(2));
		bookingmodel.setUser_id(rs.getInt(3));
		bookingmodel.setBooked_from(rs.getString(4));
		bookingmodel.setBooked_to(rs.getString(5));
		bookingmodel.setNo_of_adults(rs.getInt(6));
		bookingmodel.setNo_of_children(rs.getInt(7));
		bookingmodel.setAmount(rs.getInt(8));
		viewBookingCustomer.add(bookingmodel);
		}
		System.out.println("After query");
		return viewBookingCustomer;
	}
}
