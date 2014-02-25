package com.itechart.phonny.model.dao.databaseimpl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.sql.DataSource;


public enum StorageProvider {
	
	INSTANCE;
	
	// TODO: move to .properties file
	
	private static final String JNDI_CONTEXT = "java:comp/env";
	
	private static final String JNDI_DB_POOL = "jdbc/jdee";
	
	private static final String DB_CANNOT_CONNECT_MESSAGE = "Couldn't find Datasource";
	
	private DataSource pool;
	
	private StorageProvider() {
		
		init();
	}

	private void init() {

		Context env = null;
		try {
			env = (Context) new InitialContext().lookup(JNDI_CONTEXT);
			pool = (DataSource) env.lookup(JNDI_DB_POOL);
			if(pool == null) {
                throw new ServletException(DB_CANNOT_CONNECT_MESSAGE);
            }			
		} catch (NamingException|ServletException e) {
			// TODO: add logger.error
			System.out.println(e);
		}
	}
	
	public Connection getConnection() throws SQLException {
		
		return pool.getConnection();
	}
}
