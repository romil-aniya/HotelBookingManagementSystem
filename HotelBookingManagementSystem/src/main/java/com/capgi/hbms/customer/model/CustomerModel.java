package com.capgi.hbms.customer.model;

public class CustomerModel {

	private int user_id;
	private String password,role,user_name,address,email;
	private long mobile_no,phone;
	
	public CustomerModel() {
		
	}

	public CustomerModel(int user_id, String password, String role, String user_name, String address, String email,
			long mobile_no, long phone) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.role = role;
		this.user_name = user_name;
		this.address = address;
		this.email = email;
		this.mobile_no = mobile_no;
		this.phone = phone;
		
		System.out.println(password);
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
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

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerModel [user_id=" + user_id + ", password=" + password + ", role=" + role + ", user_name="
				+ user_name + ", address=" + address + ", email=" + email + ", mobile_no=" + mobile_no + ", phone="
				+ phone + "]";
	}
	
	
}
