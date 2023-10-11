package com.project.OnlineBookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookList")
public class AddBooks {

	@Id
	private int id ;
	private String BookName ;
	private String BookAuthor ;
	private String BookType ;
	private int price ;
	private String url ;
	
	
	public AddBooks(int id, String bookName, String bookAuthor, String bookType, int price, String url) {
		super();
		this.id = id;
		BookName = bookName;
		BookAuthor = bookAuthor;
		BookType = bookType;
		this.price = price;
		this.url = url;
	}


	public AddBooks() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public String getBookAuthor() {
		return BookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}


	public String getBookType() {
		return BookType;
	}


	public void setBookType(String bookType) {
		BookType = bookType;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "AddBooks [id=" + id + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", BookType=" + BookType
				+ ", price=" + price + ", url=" + url + "]";
	}
	
	
	
	
}
