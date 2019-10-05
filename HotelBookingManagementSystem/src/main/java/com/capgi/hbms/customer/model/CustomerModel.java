package com.capgi.hbms.customer.model;

public class CustomerModel {

	private String user_id,password,role,username,address,email;
	private int mobile_no,phone;
	
	public CustomerModel() {
		
	}
	

	public CustomerModel(String user_id, String password, String role, String username, String address, String email,
			int mobile_no, int phone) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.role = role;
		this.username = username;
		this.address = address;
		this.email = email;
		this.mobile_no = mobile_no;
		this.phone = phone;
	}



	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerModel [user_id=" + user_id + ", password=" + password + ", role=" + role + ", username="
				+ username + ", address=" + address + ", email=" + email + ", mobile_no=" + mobile_no + ", phone="
				+ phone + "]";
	}
	
	
}
