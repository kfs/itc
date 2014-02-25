package com.itechart.phonny.model.dao;


public enum SearchValues {
    
    EMPTY(""),
    BIRTH_CONCRETE_DATE("concrete-date"),
    BIRTH_UP_DATE("up-date"),
    BIRTH_DOWN_DATE("down-date"),
    GENDER_NOT_SELECTED("gender-not-selected"),
    GENDER_MALE("gender-male"),
    GENDER_FEMALE("gender-female"),
    MARITAL_NOT_SELECTED("marital-not-selected"),
    MARITAL_YES("marital-yes"),
    MARITAL_NO("marital-no");
    
    private String value;
    
    private SearchValues(String value) {

        this.value = value;
    }
    
    public String value() {
        
        return value;
    }
}
