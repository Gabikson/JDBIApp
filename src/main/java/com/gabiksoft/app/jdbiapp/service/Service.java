package com.gabiksoft.app.jdbiapp.service;


import org.postgresql.ds.PGPoolingDataSource;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import javax.sql.DataSource;

public class Service {

    public static final String DB_DRIVER_CLASS = "org.postgresql.Driver";
    public static final String SERVER_DB = "localhost:5432";
    public static final String DB_NAME = "Test";
    public static final String CONNECTIO_LOGIN = "postgres";
    public static final String CONNECTIO_PASSWORD = "1111";

    private DataSource source;
    private Handle handle;
    private boolean loadDriver() {
        System.out.println("Loading driver...");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e.getMessage());
        return false;
        }
        System.out.println("Driver loaded.");
        return true;
    }

    private DataSource createDataSources() {
        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setDataSourceName("Test Data Source");
        source.setServerName(SERVER_DB);
        source.setDatabaseName(DB_NAME);
        source.setUser(CONNECTIO_LOGIN);
        source.setPassword(CONNECTIO_PASSWORD);
        source.setMaxConnections(10);
        return source;
    }

    public Service() {
        init();
    }

    public void init() {
        if(loadDriver()) {
            source = createDataSources();
        }
    }

    public void open(){
        DBI dbi = new DBI(source);
        handle = dbi.open();
        System.out.println("Connection opened...");
    }

    public void close(){
        handle.close();
        System.out.println("Connection closed...");
    }
}
