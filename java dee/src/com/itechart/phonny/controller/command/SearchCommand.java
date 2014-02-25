package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;


public class SearchCommand implements Command {

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

        // do nothing
    }

    @Override
    public String getPageURI() {

        return RequestPage.SEARCH_PAGE;
    }

}
