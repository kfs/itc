package com.itechart.phonny.model.entity;

import java.util.Date;

public class ContactPhone {

	private String filename;
	
	private Date uploadDate;
	
	private String comment;
	
	public ContactPhone() {

		super();
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
