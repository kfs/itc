package com.itechart.phonny.model.entity;

public class Workplace {

	private String organization;
	
	public Workplace() {

		super();
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	@Override
	public String toString() {

		return organization;
	}
	
}
