package com.itechart.phonny.model.dao.databaseimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.entity.PhoneRecord;


public class PhoneRecordDAOImpl implements PhoneRecordDAO {
    
    private List<PhoneRecord> records;
    
    public PhoneRecordDAOImpl() {

        super();
        // TODO: replace with database implementation
        records = new ArrayList<>();
        PhoneRecord record = new PhoneRecord();
        record.setFirstName("Anna");
        record.setLastName("HelloWorld");
        record.setEmail("anna@helloworld.com");
        record.setBirthDate(new Date());
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);
    }

    @Override
    public void create(PhoneRecord record) {

        
    }

    @Override
    public List<PhoneRecord> getRecords() {

        return records;
    }

    @Override
    public void update(PhoneRecord record) {

        
    }

    @Override
    public void delete(PhoneRecord record) {

        
    }
}
