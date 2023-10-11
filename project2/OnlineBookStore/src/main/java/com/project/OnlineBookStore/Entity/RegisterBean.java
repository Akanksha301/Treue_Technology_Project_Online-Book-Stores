package com.project.OnlineBookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="register")
public class RegisterBean {
 private String name ;
 private String contact ;
 private String email ;
 @Id
 private String username ;
 private String password ;
 
 
public RegisterBean(String name, String contact, String email, String username, String password) {
	super();
	this.name = name;
	this.contact = contact;
	this.email = email;
	this.username = username;
	this.password = password;
}


public RegisterBean() {
	super();
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "RegisterBean [name=" + name + ", contact=" + contact + ", email=" + email + ", username=" + username
			+ ", password=" + password + "]";
}
 
 
 
}
