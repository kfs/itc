package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;


public class NotFoundCommand implements Command {

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

        System.out.println("NOT_FOUND");
    }

    @Override
    public String getPageURI() {

        return RequestPage.NOT_FOUND_PAGE;
    }

}
