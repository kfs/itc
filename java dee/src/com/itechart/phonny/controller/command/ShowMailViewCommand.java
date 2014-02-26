package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;


public class ShowMailViewCommand extends AbstractCommand {

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

    	LOGGER.debug("Requested >>ShowMailView command.");
    }

    @Override
    public String getPageURI() {

        return RequestPage.SEND_MAIL_PAGE;
    }

}
