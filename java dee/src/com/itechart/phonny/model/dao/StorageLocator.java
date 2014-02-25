package com.itechart.phonny.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.itechart.phonny.model.dao.databaseimpl.PhoneRecordDAOImpl;
import com.itechart.phonny.model.dao.databaseimpl.SearchEngineImpl;


public enum StorageLocator {
    INSTANCE;
    
    private Map<Class<?>, Object> daos;
    
    private StorageLocator() {

        init();
    }

    private void init() {

        daos = new HashMap<>();
        daos.put(PhoneRecordDAO.class, new PhoneRecordDAOImpl());
        daos.put(SearchEngine.class, new SearchEngineImpl());
    }
    
    public Object getDAO(Class<?> interfaceName) {
        
        return daos.get(interfaceName);
    }
}
