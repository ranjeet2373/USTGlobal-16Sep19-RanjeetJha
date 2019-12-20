package com.ustglobal.lms.dto;

import java.util.List;

public class LibraryResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private BookBean bookbean;
	private StudentBean sb;
	
	public StudentBean getSb() {
		return sb;
	}
	public void setSb(StudentBean sb) {
		this.sb = sb;
	}
	public BookBean getBookbean() {
		return bookbean;
	}
	public void setBookbean(BookBean bookbean) {
		this.bookbean = bookbean;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
