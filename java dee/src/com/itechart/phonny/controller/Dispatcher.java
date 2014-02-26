package com.itechart.phonny.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itechart.phonny.controller.command.Command;
import com.itechart.phonny.controller.command.CommandFactory;

public class Dispatcher {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Dispatcher.class);

    public void dispatch(HttpServletRequest request, HttpServletResponse response) {
        
        String requestedURI = request.getRequestURI();
        LOGGER.debug("Page requested:\n {}", requestedURI);
        Command command = CommandFactory.getCommand(requestedURI);
        command.proccess(request, response);       
        forward(command.getPageURI(), request, response);
    }
    
    private void forward(String pageURI, HttpServletRequest request,
                         HttpServletResponse response) {
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(pageURI);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
