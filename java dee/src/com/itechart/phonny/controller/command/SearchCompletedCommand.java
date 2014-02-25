package com.itechart.phonny.controller.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;
import com.itechart.phonny.model.dao.SearchEngine;
import com.itechart.phonny.model.dao.StorageLocator;
import com.itechart.phonny.model.entity.PhoneRecord;


public class SearchCompletedCommand implements Command {

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

        System.out.println("SEARCH");
        createSearchRequest(request);
    }

    private void createSearchRequest(HttpServletRequest request) {

        SearchEngine searchEngine = (SearchEngine) StorageLocator.INSTANCE
                                                  .getDAO(SearchEngine.class);
        setSearchAttributes(searchEngine, request);
        List<PhoneRecord> records = searchEngine.search();
        request.setAttribute("allRecords", records);
        searchEngine.clear();
    }

    private void setSearchAttributes(SearchEngine searchEngine,
            HttpServletRequest request) {

        
    }

    @Override
    public String getPageURI() {

        return RequestPage.INDEX_PAGE;
    }

}
