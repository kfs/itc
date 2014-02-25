package com.itechart.phonny.model.entity;


public class Address {
	
	private String country;
	
	private String city;
	
	private String street;
	
	private String houseNumber;
	
	private String apartmentNumber;
	
	private int postCode;
	
	public Address() {
		
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		final String SEPARATOR = ", ";
		builder.append(country).append(SEPARATOR)
			.append(city).append(SEPARATOR)
			.append(street).append(SEPARATOR)
			.append(houseNumber).append(SEPARATOR)
			.append(apartmentNumber).append(SEPARATOR)
			.append(postCode);
		return builder.toString();
	}

}
