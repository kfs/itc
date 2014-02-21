package com.itechart.phonny.model.entity;

import java.util.Date;

public class PhoneRecord {

    private String firstName;

    private String lastName;

    private String email;

    private Date   birthDate;

    public String getFirstName() {

        return this.firstName;
    }

    public void setFirstName(final String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public void setLastName(final String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return this.email;
    }

    public void setEmail(final String email) {

        this.email = email;
    }

    public Date getBirthDate() {

        return this.birthDate;
    }

    public void setBirthDate(final Date birthDate) {

        this.birthDate = birthDate;
    }

    public PhoneRecord() {

        super();
    }
}
