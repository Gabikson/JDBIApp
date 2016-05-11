package com.gabiksoft.app.jdbiapp;


import com.gabiksoft.app.jdbiapp.service.Service;
import org.h2.jdbcx.JdbcConnectionPool;
import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.osgi.PGDataSourceFactory;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

public class LauncherJDBI {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Service service = new Service();
        service.open();
        service.createTable();
        service.close();
        System.out.println("Testing mapper...");
        service.testMapper();
    }
}
