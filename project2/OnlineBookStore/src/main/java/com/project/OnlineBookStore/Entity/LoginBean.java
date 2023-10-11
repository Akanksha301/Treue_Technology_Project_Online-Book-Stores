package com.project.OnlineBookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register")
public class LoginBean {

	@Id
	private String username ;
	private String Password ;
	
	
	public LoginBean(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}


	public LoginBean() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", Password=" + Password + "]";
	}
	
	
}
