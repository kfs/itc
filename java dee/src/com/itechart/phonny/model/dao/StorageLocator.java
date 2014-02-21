package com.itechart.phonny.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.itechart.phonny.model.dao.databaseimpl.PhoneRecordDAOImpl;


public enum StorageLocator {
    INSTANCE;
    
    private Map<Class<?>, Object> daos;
    
    private StorageLocator() {

        init();
    }

    private void init() {

        daos = new HashMap<>();
        daos.put(PhoneRecordDAO.class, new PhoneRecordDAOImpl());
    }
    
    public Object getDAO(Class<?> interfaceName) {
        
        return daos.get(interfaceName);
    }
}
