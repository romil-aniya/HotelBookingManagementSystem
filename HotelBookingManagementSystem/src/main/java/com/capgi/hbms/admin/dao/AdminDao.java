package com.capgi.hbms.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public AdminDao() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.174:3306/hbms","hoteladmin","admin@123");
	}
	
}
