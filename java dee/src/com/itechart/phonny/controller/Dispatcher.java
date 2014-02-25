package com.itechart.phonny.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.itechart.phonny.controller.command.Command;
import com.itechart.phonny.controller.command.CommandFactory;

public class Dispatcher {
    
    private static final Logger LOGGER = Logger.getLogger(Dispatcher.class);

    public void dispatch(HttpServletRequest request, HttpServletResponse response) {
        
        String requestedURI = request.getRequestURI();
        Command command = CommandFactory.getCommand(requestedURI);
        command.proccess(request, response);
        
        // TODO: remove and provide log filter
        System.out.println(request.getRequestURI() + "\n---------------------------");
        
        forward(command.getPageURI(), request, response);
    }
    
    private void forward(String pageURI, HttpServletRequest request,
                         HttpServletResponse response) {
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(pageURI);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            LOGGER.error(e);
        }
    }
}
