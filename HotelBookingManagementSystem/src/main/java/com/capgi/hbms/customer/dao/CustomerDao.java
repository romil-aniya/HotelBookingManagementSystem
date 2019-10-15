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
