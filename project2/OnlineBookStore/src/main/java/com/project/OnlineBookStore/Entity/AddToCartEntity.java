package com.project.OnlineBookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Cart")
public class AddToCartEntity {

	@Id
	private String username ;
	private int id ;
	private String bookname ;
	
	
	public AddToCartEntity(String username, int id, String bookname) {
		super();
		this.username = username;
		this.id = id;
		this.bookname = bookname;
	}


	public AddToCartEntity() {
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


	@Override
	public String toString() {
		return "AddToCartEntity [username=" + username + ", id=" + id + ", bookname=" + bookname + "]";
	} 
	
	
}
