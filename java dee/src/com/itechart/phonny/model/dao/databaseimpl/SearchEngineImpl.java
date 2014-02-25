package com.itechart.phonny.model.dao.databaseimpl;

import java.util.ArrayList;
import java.util.List;

import com.itechart.phonny.model.dao.SearchAttribute;
import com.itechart.phonny.model.dao.SearchEngine;
import com.itechart.phonny.model.dao.SearchPair;
import com.itechart.phonny.model.entity.PhoneRecord;


public class SearchEngineImpl implements SearchEngine {

    private List<SearchPair> searchAttributes;
    
    private List<SearchAttribute> usedAttributes;    
    
    public SearchEngineImpl() {

        super();
        init();
    }
    
    private void init() {

        searchAttributes = new ArrayList<>();
        usedAttributes = new ArrayList<>();
    }

    @Override
    public List<PhoneRecord> search() {

        // TODO: provide search implementation
        return null;
    }

    @Override
    public void addSearchAttribute(SearchAttribute attribute, Object value) {

        if(usedAttributes.contains(attribute)) {
            return;
        }
        usedAttributes.add(attribute);
        SearchPair searchPair = new SearchPair();
        searchPair.setAttribute(attribute);
        searchPair.setValue(value);
        searchAttributes.add(searchPair);
    }

    @Override
    public void clear() {

        searchAttributes.clear();
        usedAttributes.clear();
    }

}
