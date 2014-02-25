package com.itechart.phonny.model.entity;

public enum MaritalStatus {

	NOT_DEFINED("M-NS"),
	YES("M-Yes"),
	NO("M-No");
	
	private String value;
	
	private MaritalStatus(String value) {
		
		this.value = value;
	}
	
	public String value() {
		
		return value;
	}
}
