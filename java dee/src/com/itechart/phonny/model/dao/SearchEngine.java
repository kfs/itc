package com.itechart.phonny.model.dao;

import java.util.List;

import com.itechart.phonny.model.entity.PhoneRecord;


public interface SearchEngine {

    List<PhoneRecord> search();
    
    void addSearchAttribute(SearchAttribute attribute, Object value);
    
    void clear();
    
}
