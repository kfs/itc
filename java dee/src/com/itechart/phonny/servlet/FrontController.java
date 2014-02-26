package com.itechart.phonny.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.itechart.phonny.controller.Dispatcher;


public class FrontController extends HttpServlet {

    /**
     * 
     */
    
    private static final long serialVersionUID = 74475842307216232L;
    
    public static final Logger LOGGER = Logger.getLogger(FrontController.class);
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {

    	Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(req, resp);
    }
    
}
