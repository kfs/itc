package com.itechart.phonny.model.dao;

import java.util.List;

import com.itechart.phonny.model.entity.PhoneRecord;


public interface PhoneRecordDAO {

    void create(PhoneRecord record);
    
    List<PhoneRecord> getRecords();
    
    void update(PhoneRecord record);
    
    void delete(PhoneRecord record);
    
}
