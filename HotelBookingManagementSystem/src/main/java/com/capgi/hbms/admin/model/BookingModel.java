package com.capgi.hbms.admin.model;

public class BookingModel {

	private String   booked_from, booked_to;
	private int booking_id, room_id, user_id, no_of_adults, no_of_children;
	private double amount;
	
	public BookingModel() {
		
	}
	
	public BookingModel(int booking_id, int room_id, int user_id, String booked_from, String booked_to,
			int no_of_adults, int no_of_children, double amount) {
		super();
		this.booking_id = booking_id;
		this.room_id = room_id;
		this.user_id = user_id;
		this.booked_from = booked_from;
		this.booked_to = booked_to;
		this.no_of_adults = no_of_adults;
		this.no_of_children = no_of_children;
		this.amount = amount;
	}


	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getBooked_from() {
		return booked_from;
	}

	public void setBooked_from(String booked_from) {
		this.booked_from = booked_from;
	}

	public String getBooked_to() {
		return booked_to;
	}

	public void setBooked_to(String booked_to) {
		this.booked_to = booked_to;
	}

	public int getNo_of_adults() {
		return no_of_adults;
	}

	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}

	public int getNo_of_children() {
		return no_of_children;
	}

	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "BookingModel [booking_id=" + booking_id + ", room_id=" + room_id + ", user_id=" + user_id
				+ ", booked_from=" + booked_from + ", booked_to=" + booked_to + ", no_of_adults=" + no_of_adults
				+ ", no_of_children=" + no_of_children + ", amount=" + amount + "]";
	}
	
	
	
}
