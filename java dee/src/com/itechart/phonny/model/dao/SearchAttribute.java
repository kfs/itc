package com.itechart.phonny.model.dao;


public enum SearchAttribute {

    FIRST_NAME("first-name"),
    LAST_NAME("last-name"),
    PATRONYMIC("patronymic"),
    BIRTH_DATE_OPERATION("birth-behaviour"),
    BIRTH_DATE("birthdate"),
    GENDER("gender"),
    MARITAL_STATUS("marital"),
    NATIONALITY("nationality"),
    COUNTRY("country"),
    CITY("city"),
    STREET("street"),
    HOUSE_NUMBER("house-number"),
    APARTMENT_NUMBER("apartment-number"),
    POSTAL_CODE("post-code");
    
    private String name;
    
    
    private SearchAttribute(String name) {

        this.name = name;
    }
    
    public String value() {
        return name;
    }
}
