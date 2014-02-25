package com.itechart.phonny.model.entity;

public class Attachment {
	
	private int countryCode;
	
	private int operatorCode;
	
	private int phoneNumber;
	
	private String phoneType;
	
	private String comment;
	
	public Attachment() {

		super();
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(int operatorCode) {
		this.operatorCode = operatorCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
