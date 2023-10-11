package com.project.OnlineBookStore.Entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderPlaced")
public class BookBuyers {

	@Id
	private String username ;
	private int id ;
	private String address ;
	private String state ;
	private String pincode ;
	private Date datetime ;
	
	
	public BookBuyers(String username, int id, String address, String state, String pincode, Date datetime) {
		super();
		this.username = username;
		this.id = id;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.datetime = datetime;
	}


	public BookBuyers() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public Date getDatetime() {
		return datetime;
	}


	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}


	@Override
	public String toString() {
		return "BookBuyers [username=" + username + ", id=" + id + ", address=" + address + ", state=" + state
				+ ", pincode=" + pincode + ", datetime=" + datetime + "]";
	}
	
}
