package com.itechart.phonny.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class ResourceFilter implements Filter {

    private static final String RESOURCE_PREFIX = "/resources/";
    
    private static final String PAGE_PREFIX = "/pages";
    
    private static final String APPLICATION_PREFIX = "/java_dee";
    
    public ResourceFilter() {

        super();
    }
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        // do nothing
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
            FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String path = getRequestPath(request);
        if(path.startsWith(RESOURCE_PREFIX)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher(PAGE_PREFIX + path);
            dispatcher.forward(servletRequest, servletResponse);
        }
    }

    private String getRequestPath(HttpServletRequest request) {

        String requestPath = request.getRequestURI();
        requestPath = requestPath.substring(APPLICATION_PREFIX.length());
        return requestPath;
    }

    @Override
    public void destroy() {

        // do nothing
    }
    
}
