package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface Command {

    void proccess(HttpServletRequest request, HttpServletResponse response);
    
    String getPageURI();
    
}
