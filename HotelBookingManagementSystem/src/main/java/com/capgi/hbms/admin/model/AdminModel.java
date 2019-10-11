package com.capgi.hbms.admin.model;

public class AdminModel {

	private int hotel_id;
	private String city, hotel_name, address, description, email;
	private double avg_rate_per_night, rating;
	private long phone_no1, phone_no2;
	private int fax;
	
	public AdminModel() {
		
	}
	
	public AdminModel(int hotel_id, String city, String hotel_name, String address, String description, String email, double avg_rate_per_night, double rating, long phone_no1, long phone_no2, int fax) {
		super();
		this.hotel_id = hotel_id;
		this.city = city;
		this.hotel_name = hotel_name;
		this.address = address;
		this.description = description;
		this.email = email;
		this.avg_rate_per_night = avg_rate_per_night;
		this.rating = rating;
		this.phone_no1 = phone_no1;
		this.phone_no2 = phone_no2;
		this.fax = fax;
	}


	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAvg_rate_per_night() {
		return avg_rate_per_night;
	}
	public void setAvg_rate_per_night(double avg_rate_per_night) {
		this.avg_rate_per_night = avg_rate_per_night;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getPhone_no1() {
		return phone_no1;
	}
	public void setPhone_no1(long phone_no1) {
		this.phone_no1 = phone_no1;
	}
	public long getPhone_no2() {
		return phone_no2;
	}
	public void setPhone_no2(long phone_no2) {
		this.phone_no2 = phone_no2;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "AdminModel [hotel_id=" + hotel_id + ", city=" + city + ", hotel_name="
				+ hotel_name + ", address=" + address + ", description=" + description + ", email=" + email
				+ ", avg_rate_per_night=" + avg_rate_per_night + ", rating=" + rating + ", phone_no1=" + phone_no1
				+ ", phone_no2=" + phone_no2 + ", fax=" + fax + "]";
	} 
	
	
}
