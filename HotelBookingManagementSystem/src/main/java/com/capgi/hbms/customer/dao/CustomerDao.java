package com.capgi.hbms.customer.dao;

import com.capgi.hbms.customer.model.*;
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
	
	public CustomerDao() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.174:3306/hbms","hoteladmin","admin@123");
	}
	
	public boolean registerCustomer(CustomerModel customermodel) {
		return false;
	}
	
	public boolean loginCustomer(String user_name, String password) {
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
	
	public boolean bookRoomCustomer(RoomModel roommodel) {
		return false;
	}
	
	public boolean modifyBookingCustomer(BookingModel bookingmodel) {
		return false;
	}
	
	public List<CustomerModel> viewHotelCustomer(){
		List<CustomerModel> viewHotelCustomer = new ArrayList<CustomerModel>();
		
		return viewHotelCustomer;
	}
	
	public List<RoomModel> viewRoomCustomer(){
		List<RoomModel> viewRoomCustomer = new ArrayList<RoomModel>();
		
		return viewRoomCustomer;
	}
	public List<CustomerModel> viewProfileCustomer(){
		List<CustomerModel> viewProfileCustomer = new ArrayList<CustomerModel>();
		
		return viewProfileCustomer;
	}
	
	public List<BookingModel> viewBookingCustomer(){
		List<BookingModel> viewBookingCustomer = new ArrayList<BookingModel>();
		
		return viewBookingCustomer;
	}
}
