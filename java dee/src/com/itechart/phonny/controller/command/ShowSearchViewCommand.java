package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;


public class ShowSearchViewCommand extends AbstractCommand {
	
	public ShowSearchViewCommand() {

		super();
	}

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

    	LOGGER.debug("Requested >>ShowSearchView command.");
    }

    @Override
    public String getPageURI() {

        return RequestPage.SEARCH_PAGE;
    }

}
