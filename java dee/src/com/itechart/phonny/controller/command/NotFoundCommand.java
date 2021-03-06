package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;


public class NotFoundCommand extends AbstractCommand {
	
	public NotFoundCommand() {
		
		super();
	}

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

    	LOGGER.debug("Forwarded to >>404_NOT_FOUND command.");
    }

    @Override
    public String getPageURI() {

        return RequestPage.NOT_FOUND_PAGE;
    }

}
