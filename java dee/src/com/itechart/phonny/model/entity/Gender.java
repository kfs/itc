package com.itechart.phonny.model.entity;

public enum Gender {

	NOT_DEFINED("G-NS"),
	MALE("Male"),
	FEMALE("Female");
	
	private String value;
	
	private Gender(String value) {

		this.value = value;
	}
	
	public String value() {
		
		return this.value;
	}
}
