package com.itechart.phonny.model.entity;

import java.util.Date;
import java.util.List;

public class PhoneRecord {

    private String firstName;

    private String patronymic;
    
    private String surname;
    
    private String webSite;

    private String email;

    private Date   birthDate;
    
    private Gender gender;
    
    private MaritalStatus maritalStatus;
    
    private Workplace workplace;
    
    private Address address;
    
    private List<Attachment> attachments;
    
    private List<ContactPhone> contactPhones;
    
    public PhoneRecord() {

        super();
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Workplace getWorkplace() {
		return workplace;
	}

	public void setWorkplace(Workplace workplace) {
		this.workplace = workplace;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<ContactPhone> getContactPhones() {
		return contactPhones;
	}

	public void setContactPhones(List<ContactPhone> contactPhones) {
		this.contactPhones = contactPhones;
	}

	public String getFullName() {
    	
    	StringBuilder builder = new StringBuilder();
    	builder.append(firstName).append(' ')
    		.append(patronymic).append(' ')
    		.append(surname);
    	return builder.toString();
    }
}
