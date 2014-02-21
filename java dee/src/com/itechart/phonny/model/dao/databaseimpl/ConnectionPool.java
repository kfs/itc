package com.itechart.phonny.model.dao.databaseimpl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static final int CONNECTION_POOL_SIZE = 10;

    private List<Connection> pool;

    public ConnectionPool() {

        init();
    }

    private void init() {

        this.pool = new ArrayList<>(CONNECTION_POOL_SIZE);
        for (int i = 0; i < CONNECTION_POOL_SIZE; i++) {
            // pool.add(new Connection)
        }
    }
    
    public Connection getConnection() {
        
        return null;
    }

    public void releaseConnection(Connection connection) {
        
    }
}
