package com.capgi.hbms.admin.model;

public class RoomModel {

	private String room_id, room_type;
	private int room_no;
	private double per_night_rate;
	private Boolean availability;
	
	public RoomModel() {
		
	}

	public RoomModel(String room_id, String room_type, int room_no, double per_night_rate, Boolean availability) {
		super();
		this.room_id = room_id;
		this.room_type = room_type;
		this.room_no = room_no;
		this.per_night_rate = per_night_rate;
		this.availability = availability;
	}

	public String getRoom_id() {
		return room_id;
	}

	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public int getRoom_no() {
		return room_no;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	public double getPer_night_rate() {
		return per_night_rate;
	}

	public void setPer_night_rate(double per_night_rate) {
		this.per_night_rate = per_night_rate;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "RoomModel [room_id=" + room_id + ", room_type=" + room_type + ", room_no=" + room_no
				+ ", per_night_rate=" + per_night_rate + ", availability=" + availability + "]";
	}
	
	
	
}
