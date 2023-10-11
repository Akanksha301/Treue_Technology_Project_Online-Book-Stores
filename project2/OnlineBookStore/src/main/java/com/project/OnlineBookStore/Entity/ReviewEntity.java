package com.project.OnlineBookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Rating")
public class ReviewEntity {

	@Id
	private String username ;
	private int id ;
	private String bookname ;
	private String rate ;
	
	public ReviewEntity(String username, int id, String bookname, String rate) {
		super();
		this.username = username;
		this.id = id;
		this.bookname = bookname;
		this.rate = rate;
	}
	
	
	
	public ReviewEntity() {
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
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}



	@Override
	public String toString() {
		return "ReviewEntity [username=" + username + ", id=" + id + ", bookname=" + bookname + ", rate=" + rate + "]";
	}
	
	
	
}
