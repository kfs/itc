package com.itechart.phonny.model.dao;

import java.util.List;

import com.itechart.phonny.model.entity.PhoneRecord;


public interface PhoneRecordDAO {

    void create(PhoneRecord record);
    
    PhoneRecord getRecord(String email);
    
    List<PhoneRecord> getRecords(int first, int last);
    
    void update(PhoneRecord record);
    
    void delete(String email);
    
}
