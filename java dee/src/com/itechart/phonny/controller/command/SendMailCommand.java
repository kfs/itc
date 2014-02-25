package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;


public class SendMailCommand implements Command {

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

        System.out.println("SEND_MAIL");
    }

    @Override
    public String getPageURI() {

        return RequestPage.SEND_MAIL_PAGE;
    }

}
